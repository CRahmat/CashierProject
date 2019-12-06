package Main;

import Connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import login.MVCLogin;
import registrasi.MVCRegister;
    public class Main {
        private boolean login;
    public static void main(String[] args) throws SQLException {
                boolean login = false;
        try{
        String query = "SELECT * FROM admin";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);
        while(result.next()){
            
            login = true;
        }
        if(login == true){
            new MVCLogin();
        }else{
        new MVCRegister();
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NOT FOUND DATABASE");
        }
    }
    
}
