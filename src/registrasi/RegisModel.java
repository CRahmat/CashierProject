package registrasi;

import Connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegisModel {
    private String name;
    private String address;
    private String gender;
    private String password;
    private String telp;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    } 
    
    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }        
    
    public void create(String Name, String Address, String Gender, String Telp, String Password){
        try{
            String query = "INSERT INTO admin (Name, Address, Gender, Telp, Password) VALUES" + " ('"+Name+"','"+Address+"','"+Gender+"','"+Telp+"','"+Password+"')";                       
            Statement statement = DatabaseConnection.getConnection().createStatement();
            System.out.println("Berhasil");
            statement.executeUpdate(query);
            System.out.println("Berhasil ditambahkan");
        }catch(Exception sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public int getCount(){
        int count = 0;
        try{
            String query = "SELECT count(*) as count FROM admin";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);
            
            if(result.next()){
                count = result.getInt("count");
            }
        }catch(Exception sql){
            System.out.println(sql.getMessage());
        }
        return count;
    }
    
    public String[][] getAll(){
        String[][] data = new String[this.getCount()][6];
        try{
            String query = "SELECT * FROM admin";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);
            
            int i = 0;
            while(result.next()){
                data[i][0] = result.getString("id");
                data[i][1] = result.getString("name");
                data[i][2] = result.getString("address");
                data[i][3] = result.getString("gender"); 
                data[i][4] = result.getString("telp");
                data[i][5] = result.getString("password");
                i++;
            }
        }catch(Exception sql){
            System.out.println(sql.getMessage());
        }
        return data;
    }
    
}

