package delete;
import Connection.DatabaseConnection;
import home.VCHome;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import list.MVCList;

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
      }catch(Exception sql){
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }    
    public int getCount(){
        int count = 0;
        try{
            String query = "SELECT COUNT(*) as count FROM product";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
          if(resultSet.next()){
              count = resultSet.getInt("count");
          }   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }
        return count;
    }
    public String [][] findAllProduct(){
        String[][] allProduct = new String[this.getCount()][3];
        try{
            String query = "SELECT * FROM product";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while(resultSet.next()){
              allProduct[i][0] = resultSet.getString("id_product");
              allProduct[i][1] = resultSet.getString("product_name");
              allProduct[i][2] = "Rp" + resultSet.getString("price");
              i++;
            }            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }        
        return allProduct;
    }
}