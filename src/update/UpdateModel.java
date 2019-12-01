package update;

import Connection.DatabaseConnection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Catur Rahmat
 */
public class UpdateModel {
    public void UpdateData(int productPrice, int productProfit, int productStock){
        try{
          String query = "INSERT INTO product VALUES(price = productPrice, profit = productProfit, stock = productStock)";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          System.out.println("Berhasil Ditambahkan");
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }
    
}
