/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import Connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Catur Rahmat
 */
public class HomeModel {
    public HomeModel(){
        
    }
            public String getAdminName(){
            String adminName = "";
            try{
            String query = "SELECT * FROM activeadmin";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
            adminName = resultSet.getString("username");
            }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getStackTrace());
            }
            return adminName;
        }
}
