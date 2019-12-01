package input;

import Connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Catur Rahmat
 */
public class InputModel {
    private Connection connection;
    private String productId;
    private String productName;
    private int productPrice;
    private int productProfit;
    private int productStock;
    public InputModel(){
        
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        int Price = Integer.parseInt(productPrice);
        this.productPrice = Price;
    }

    public void setProductProfit(String productProfit) {
        int Profit = Integer.parseInt(productId);
        this.productProfit = Profit;
    }

    public void setProductStock(String productStock) {
        int Stock = Integer.parseInt(productId);
        this.productStock = Stock;
    }
    public void InputData(String productID, String productName, String productPrice, String productProfit, String productStock){
        setProductId(productID);
        setProductName(productName);
        setProductPrice(productPrice);
        setProductProfit(productProfit);
        setProductStock(productStock);
        try{
          String query = "INSERT INTO product(id_product,product_name,price,profit,stock) VALUES('"+this.productId+"','"+this.productName+"',this.productPrice,this.productProfit,this.productStock)";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          System.out.println("Berhasil Ditambahkan");
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
    }
    
}
