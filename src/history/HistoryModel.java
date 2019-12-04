package history;

import Connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class HistoryModel {
    int totalProfit;
    
            public int getCount(){
        int count = 0;
        try{
            String query = "SELECT COUNT(*) as count FROM historytransaction";
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
            String query = "SELECT * FROM historytransaction INNER JOIN product ON historytransaction.id_product = product.id_product";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while(resultSet.next()){
              allProduct[i][0] = resultSet.getString("historytransaction.id_transaksi");
              allProduct[i][1] = resultSet.getString("historytransaction.date");
              allProduct[i][2] = resultSet.getString("product.product_name");
              allProduct[i][3] = resultSet.getString("historytransaction.jumlah");
              allProduct[i][4] = resultSet.getString("product.price");
              i++;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }
        
        return allProduct;
    }
    
    
}
