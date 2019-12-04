package Connection;

/**
 *
 * @author Catur Rahmat
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class DatabaseConnection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/database";
    static final String USER = "root";
    static final String PASS = "";
    private static Connection connection;
    
     public static Connection getConnection(){
        if(connection == null){
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "CONNECTION FAILED, PLEASE CHECK YOUR SERVER!!!");
            System.exit(0);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "CONNECTION FAILED, PLEASE CHECK YOUR SERVER!!!");
            System.exit(0);
        }
        }
        return connection;
    }
    
}

