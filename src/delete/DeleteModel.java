package delete;

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
public class DeleteModel {
    String productName;
    boolean checking = false;
    public DeleteModel(){
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
              }
          }
          
      }catch(Exception sql){
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
        
        return checking;
        
    }
    public void deleteData( String productID){
        try{
                String delete = "DELETE FROM product WHERE id_product = ("+productID+") ";
                Statement statement = DatabaseConnection.getConnection().createStatement();
                statement.executeUpdate(delete);
                JOptionPane.showMessageDialog(null, "'"+productName+"' SUCCESSFULLY DELETED");
                MVCList mVCList = new MVCList();
      }catch(Exception sql){
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }

    }
}
