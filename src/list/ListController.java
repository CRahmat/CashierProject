package list;
import home.VCHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import profit.ProfitModel;
import profit.ProfitView;

public class ListController {
    ListModel listModel;
   ListView listView;
    public ListController(ListModel listModel, ListView listView){
        this.listModel = listModel;
        this.listView = listView;
        
            String data[][] = listModel.findAllProduct();
            listView.listProduct.setModel((new JTable(data, listView.colom)).getModel());
            listView.listProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mousePressed(e);
                    int row = listView.listProduct.getSelectedRow();
                    int col = listView.listProduct.getSelectedColumn();
                    listView.listProduct.getValueAt(row,0).toString();
                }                
});
            listView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                listView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
    }   
}