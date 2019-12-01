package delete;

import Connection.DatabaseConnection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Catur Rahmat
 */
public class DeleteModel {
    public DeleteModel(){
    }
    public void deleteData(String productID){
    try{
          String query = "DELETE from database WHERE id_product = 'productID'";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          System.out.println("Data Berhasil Di Hapus");
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }
    
}
