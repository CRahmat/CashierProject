package cashier;
import home.VCHome;
import input.MVCInput;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import update.UpdateModel;
import update.UpdateView;

public class CashierController {
    CashierModel cashierModel;
    CashierView cashierView;
    String productName;
    int jumlahItem = 0;
    boolean checking = false;
    public CashierController(CashierModel cashierModel, CashierView cashierView){
    this.cashierModel = cashierModel;
    this.cashierView = cashierView;
    String data[][] = cashierModel.findAllProduct();  
    int row = cashierView.listProduct.getSelectedRow();
    int col = cashierView.listProduct.getSelectedColumn();
    cashierView.listProduct.setModel((new JTable(data, cashierView.colom)).getModel());
        
    cashierView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseClicked(me);
                cashierView.layout.setVisible(false);
                cashierModel.transaction = false;
                if(cashierView.listShop.getRowCount() == 0){
                   cashierModel.transaction = true;
                    new VCHome();
                }else if(cashierModel.transaction == false){
                    cashierView.layout.setVisible(true);
                    JOptionPane.showMessageDialog(null, "SILAHKAN MEMBAYAR TERLEBIH DAHULU!!!");
                    
                }else{
                    new VCHome();
                }
            }
    });
    cashierView.listProduct.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseClicked(me);
                int selectedRow = cashierView.listProduct.getSelectedRow();
                String productID = String.valueOf(cashierView.listProduct.getValueAt(selectedRow, 0));
                cashierModel.checkingData(productID);
                   if(cashierModel.checking == true){
                   cashierView.setproductID(productID);
                   cashierView.setproductName(cashierModel.productName);
                   cashierView.setprice(cashierModel.productPrice);
                   cashierView.setstock(cashierModel.productStock);
                   cashierView.settotalShop(String.valueOf(cashierModel.jumlahBelanja));
                   cashierView.setjumlahItem(String.valueOf(cashierModel.jumlahItem));
                   //INPUT TO TABLE SHOP
                   //INPUT TO DATABASE
                   String Date = cashierView.ldate.getText() +"|"+  cashierView.lclock.getText();
                   int price = Integer.parseInt(cashierModel.productPrice);
                   int profit = Integer.parseInt(cashierModel.productProfit);
                   cashierModel.addHistory(productID, Date, cashierModel.jumlahItem,price, profit);
                   cashierView.tableShop.insertRow(cashierView.tableShop.getRowCount(), new Object[]{
                       cashierModel.productNumber, cashierModel.productName, 
                       "Rp" + cashierModel.productPrice, cashierModel.jumlahItem
                   });
                    int updateStock = Integer.parseInt(cashierModel.productStock);
                    updateStock--;
                    cashierModel.updateStock(cashierView.tfproductID.getText(), updateStock);
                   cashierModel.checking = false;
               }
                else{
                    JOptionPane.showMessageDialog(null, "NOT FOUND '"+productID+"' IN DATABASE");
                    cashierView.setproductName("");
                    cashierView.setprice("");
                    cashierView.setstock("");
                    cashierView.setproductID("");
                    cashierView.setjumlahItem("");
                    cashierView.settotalShop(String.valueOf(cashierModel.jumlahBelanja));
                }               
            }
    });
    cashierView.tfproductID.addActionListener(new ActionListener() {//Action jika di Pencet Add
            @Override
            public void actionPerformed(ActionEvent e) {
               String productID = cashierView.getproductID();
               cashierModel.checkingData(productID);
                if(cashierModel.checking == true){
                   cashierView.setproductName(cashierModel.productName);
                   cashierView.setprice(cashierModel.productPrice);
                   cashierView.setstock(cashierModel.productStock);
                   cashierView.settotalShop(String.valueOf(cashierModel.jumlahBelanja));
                   cashierView.setjumlahItem(String.valueOf(cashierModel.jumlahItem));
                   //INPUT TO DATABASE
                   String Date = cashierView.ldate.getText() +"|"+  cashierView.lclock.getText();
                   int price = Integer.parseInt(cashierModel.productPrice);
                   int profit = Integer.parseInt(cashierModel.productProfit);
                   cashierModel.addHistory(productID, Date, cashierModel.jumlahItem,price, profit);
                   cashierView.tableShop.insertRow(cashierView.tableShop.getRowCount(), new Object[]{
                       cashierModel.productNumber, cashierModel.productName, 
                       "Rp" + cashierModel.productPrice, cashierModel.jumlahItem
                   });
                    int updateStock = Integer.parseInt(cashierModel.productStock);
                    updateStock--;
                   cashierModel.checking = false;
                   cashierView.tfproductID.setText("");
               }
                else{
                    JOptionPane.showMessageDialog(null, "NOT FOUND '"+productID+"' IN DATABASE");
                    cashierView.setproductName("");
                    cashierView.setprice("");
                    cashierView.setstock("");
                    cashierView.setproductID("");
                    cashierView.setjumlahItem("");
                    cashierView.settotalShop(String.valueOf(cashierModel.jumlahBelanja));
                }
            }
        }
        );
        cashierView.tfmoney.addActionListener(new ActionListener() {//Action jika di Pencet Add
            @Override
            public void actionPerformed(ActionEvent e) {
                int money = Integer.parseInt(cashierView.tfmoney.getText());
                int total =cashierModel.jumlahBelanja;
                cashierModel.transaction = false;
               if(money >= total){
                   int tempChange = money - total;
                   String change = String.valueOf(tempChange);
                   cashierView.tfchange.setText(change);
                   cashierView.layout.setVisible(false);
                   JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH BERBELANJA, SELAMAT DATANG KEMBALI");
                   cashierModel.transaction = true;
                   new VCHome();
               }else{
                   cashierView.setMoney("");
                   JOptionPane.showMessageDialog(null, "UANG YANG ANDA MASSUKAN KURANG");
               }
            }
        }
        ); 
    }    
}
