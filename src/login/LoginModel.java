package login;
import Connection.DatabaseConnection;
import home.VCHome;
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
    boolean checking;
    
    public void create(String Name, String Password){
        try{
            Statement statement = DatabaseConnection.getConnection().createStatement();
            String queryakun = "SELECT * FROM admin WHERE username = '"+Name+"' AND password = '"+Password+"'";
            ResultSet result = statement.executeQuery(queryakun);
            checking = false;
            while(result.next()){
                this.checking = true;
                setChecking(checking);
            }                       
        }catch(Exception sql) {
            JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD FAILED!!!");
        }
    }
    public void getCountAccount(){
        try{
        String query = "SELECT COUNT(*) as count FROM activeadmin";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);
        if(result.next()){
        String delete = "DELETE FROM activeadmin";
        Statement statementDelete = DatabaseConnection.getConnection().createStatement();
        int resultDelete = statement.executeUpdate(delete);
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void setAdminName(String username){
        try{
            String query = "INSERT INTO activeadmin(username) VALUES ('"+username+"')";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            statement.executeUpdate(query);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    public String getAdminName(){
            String adminName = null;
            try{
            String query = "SELECT * FROM activeadmin";
            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);
            adminName = result.getString(query);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "NOT FOUND ADMIN ACTIVE");
            }
            return adminName;
        }
    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public boolean isChecking() {
        return checking;
    }
    
}    