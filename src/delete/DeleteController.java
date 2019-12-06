package delete;
import home.VCHome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class DeleteController {
    DeleteView deleteView;
    DeleteModel deleteModel;
    public DeleteController(DeleteView deleteView, DeleteModel deleteModel){
        this.deleteModel = deleteModel;
        this.deleteView = deleteView;                
            String data[][] = deleteModel.findAllProduct();
            deleteView.listProduct.setModel((new JTable(data, deleteView.colom)).getModel());
            deleteView.listProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mousePressed(e);
                    int row = deleteView.listProduct.getSelectedRow();
                    int col = deleteView.listProduct.getSelectedColumn();
                    deleteView.listProduct.getValueAt(row,0).toString();
                }
            });
            deleteView.pback.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent me){
                    super.mouseMoved(me);
                    deleteView.layout.setVisible(false);
                    VCHome vcHome = new VCHome();
                }
            });
            deleteView.tfIdProduct.addActionListener(new ActionListener() {//Action jika di Pencet Add
                @Override
                public void actionPerformed(ActionEvent e) {
                    String productID = deleteView.getIdProduct();
                    deleteModel.checkingData(productID);
                    if(deleteModel.checking == true){
                       deleteView.setNameProduct(deleteModel.productName);
                   }
                    else{
                        JOptionPane.showMessageDialog(null, "NOT FOUND '"+productID+"' IN DATABASE");
                        deleteView.setNameProduct("");
                        deleteView.setIdProduct("");
                    }
                }
            }
            );
            deleteView.pdelete.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent me){
                   super.mouseClicked(me);
                   String productID = deleteView.getIdProduct();
                   if(deleteModel.checkingData(productID) == true){
                        deleteModel.deleteData(productID);
                        String data[][] = deleteModel.findAllProduct();
                        deleteView.listProduct.setModel((new JTable(data, deleteView.colom)).getModel());
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "NOT FOUND DATA");
                   }               
               }             
    });        
    }    
}