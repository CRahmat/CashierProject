package input;

import Connection.DatabaseConnection;
import home.VCHome;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Catur Rahmat
 */
public class InputModel {
    private Connection connection;

    public InputModel(){
        
    }
    public void InputData(String productID, String productName, int productPrice, int productProfit, int productStock){
        try{
          String query = "INSERT INTO product(id_product,product_name,price,profit,stock) VALUES('"+productID+"','"+productName+"',"+productPrice+","+productProfit+","+productStock+")";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          JOptionPane.showMessageDialog(null, "'"+productName+"' SUCCESSFULLY ADD TO DATABASE");
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
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
        String[][] allProduct = new String[this.getCount()][4];
        try{
            String query = "SELECT * FROM product";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while(resultSet.next()){
              allProduct[i][0] = resultSet.getString("id_product");
              allProduct[i][1] = resultSet.getString("product_name");
              allProduct[i][2] = "Rp" + resultSet.getString("price");
              allProduct[i][3] = resultSet.getString("stock");
              i++;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }
        
        return allProduct;
    }
    
}
