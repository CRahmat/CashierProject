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
    private boolean checking;      

    public boolean isChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }
   
    public void create(String Name, String Address, String Gender, String Telp, String Password){
        checking = true;
        try{
            String query = "INSERT INTO admin (username, address, gender, telp, password) VALUES" + " ('"+Name+"','"+Address+"','"+Gender+"','"+Telp+"','"+Password+"')";                       
            Statement statement = DatabaseConnection.getConnection().createStatement();
            statement.executeUpdate(query);
            checking = false;
        }catch(Exception sql){
            setChecking(true);
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
                data[i][0] = result.getString("username");
                data[i][2] = result.getString("address");
                data[i][3] = result.getString("gender"); 
                data[i][4] = result.getString("telp");
                data[i][1] = result.getString("password");
                i++;
            }
        }catch(Exception sql){
            System.out.println(sql.getMessage());
        }
        return data;
    }    
}