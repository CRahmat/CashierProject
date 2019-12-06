package list;
import Connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ListModel {    
    public ListModel(){        
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
        String[][] allProduct = new String[this.getCount()][5];
        try{
            String query = "SELECT * FROM product";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while(resultSet.next()){
              allProduct[i][0] = resultSet.getString("id_product");
              allProduct[i][1] = resultSet.getString("product_name");
              allProduct[i][2] = "Rp" + resultSet.getString("price");
              allProduct[i][3] = resultSet.getString("profit");
              allProduct[i][4] = resultSet.getString("stock");
              i++;
            }            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }
        
        return allProduct;
    }    
}