package login;

import Connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import registrasi.MVCRegister;

public class LoginModel {
    private String name;
    private String password;
    String user;
    String pass;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password =  password;
    }
    
    public void create(String Name, String Password){
        try{
            Statement statement = DatabaseConnection.getConnection().createStatement();
            String queryakun = "SELECT * FROM admin";
            ResultSet result = statement.executeQuery(queryakun);
            while(result.next()){
            if((Name.equals(result.getString("name"))) && Password.equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Berhasil");                    
                   MVCRegister mvcRegister = new MVCRegister();
                    
                }
            else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah");
                  
                }
            }
            
            
            }catch(Exception sql) {
                JOptionPane.showMessageDialog(null, "Kesalahan!!!");
            }
        }
}    