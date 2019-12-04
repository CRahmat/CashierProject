/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

import Connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import list.MVCList;

/**
 *
 * @author Catur Rahmat
 */
public class CashierModel {
    String productName;
    String productPrice;
    String productProfit;
    String productStock;
    int jumlahItem;
    int jumlahBelanja = 0;
    int productNumber = 0;
    int totalProfit = 0;
    boolean checking = false;
    boolean transaction = false;
    public boolean checkingData(String productID){
    try{
          String query = "SELECT * FROM product ";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          ResultSet resultSet = statement.executeQuery(query); //excecute query nya
          while(resultSet.next()){
              if(productID.equals(resultSet.getString("id_product"))){
                  this.jumlahItem = 0;
                  this.checking = true;
                  this.productName = resultSet.getString("product_name");
                  int price = Integer.parseInt(resultSet.getString("price"));
                  int profit = Integer.parseInt(resultSet.getString("profit"));
                  int total = price + profit;
                  this.productProfit = resultSet.getString("profit");
                  this.productPrice = String.valueOf(total);
                  this.productStock = resultSet.getString("stock");
                  this.jumlahItem++;
                  this.productNumber++;
                  jumlahBelanja = jumlahBelanja+total;
                  
              }
          }
          
      }catch(Exception sql){
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
        return checking;
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
                  int tempprice = Integer.parseInt(resultSet.getString("price"));
                  int tempprofit = Integer.parseInt(resultSet.getString("profit"));
                  int total = tempprice + tempprofit;
                  String price = "Rp "+String.valueOf(total);
              allProduct[i][0] = resultSet.getString("id_product");
              allProduct[i][1] = resultSet.getString("product_name");
              allProduct[i][2] = price;
              allProduct[i][3] = resultSet.getString("stock");
              i++;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN");
        }
        
        return allProduct;
    }
    public void addHistory(String productID, String date, int jumlah, int price, int profit){
        try{
        String query = "INSERT INTO historytransaction(id_product, date, jumlah, price, profit) VALUES " + " ('"+productID+"','"+date+"',"+jumlah+","+price+","+profit+")";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(query);
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }        
    }
    public void updateStock(String productID, int stock){
        try{
        String query = "UPDATE product SET stock = "+stock+" WHERE id_product = '"+productID+"' ";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(query);
        }catch(SQLException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        } 
    }
    
}
