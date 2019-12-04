package update;

import Connection.DatabaseConnection;
import home.VCHome;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import list.MVCList;

/**
 *
 * @author Catur Rahmat
 */
public class UpdateModel {
    String productName;
    String productPrice;
    String productProfit;
    String productStock;
    boolean checking = false;
    public void UpdateData(String idProduct, int productPrice, int productProfit, int productStock){
        try{
          String query = "UPDATE product SET price = "+productPrice+", profit = "+productProfit+", stock = "+productStock+" WHERE id_product = '"+idProduct+"' ";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATE '"+productName+"' ");
          MVCList mVCList = new MVCList();
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }
    public boolean checkingData(String productID){
    try{
          String query = "SELECT * FROM product ";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          ResultSet resultSet = statement.executeQuery(query); //excecute query nya
          while(resultSet.next()){
              if(productID.equals(resultSet.getString("id_product"))){
                  this.checking = true;
                  this.productName = resultSet.getString("product_name");
                  this.productPrice = resultSet.getString("price");
                  this.productProfit = resultSet.getString("profit");
                  this.productStock = resultSet.getString("stock");
              }
          }
          
      }catch(Exception sql){
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
        return checking;
    }
    
}
