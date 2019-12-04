package input;

import Connection.DatabaseConnection;
import home.VCHome;
import java.sql.Connection;
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
          VCHome vCHome = new VCHome();
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }
    
}
