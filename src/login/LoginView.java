package login;
import java.awt.*;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LoginView extends JFrame{    
    JFrame login = new JFrame("Login");    
    //LAYOUT
    JPanel loginBackground = new JPanel();
    JPanel content = new JPanel();    
    JLabel Lbackground = new JLabel();
    JLabel Llogo = new JLabel();
    JLabel Lname = new JLabel("Admin Name ");
    JLabel Lpassword = new JLabel("Password");    
    JTextField TFname = new JTextField();
    JPasswordField JPpassword = new JPasswordField();    
    JButton Submit = new JButton("Login");
    JButton Regis = new JButton("Register");
    JLabel LVersion = new JLabel("Cashier Application v.1.0.0");    
    ImageIcon logo = new ImageIcon(getClass().getResource("/img/Logo.png"));
    ImageIcon background = new ImageIcon(getClass().getResource("/img/BackgroundContent.jpg"));
    
    public LoginView() {
        initComponents();
        login.setSize(550,600);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setResizable(true);        
    }
    public void initComponents(){
        login.add(Lbackground);
        login.add(loginBackground);        
        Llogo.setBounds(170, 50, 200, 100);
        Llogo.setIcon(logo);
        login.add(Llogo);               
        Lname.setFont(new Font("Agency FB", Font.BOLD , 30));
        Lname.setForeground(Color.WHITE);
        Lname.setBounds(30, 180, 120, 40);
        TFname.setFont(new Font("Agency FB", Font.BOLD , 24));
        TFname.setBounds(170, 180, 300, 40);
        TFname.setForeground(Color.WHITE);
        TFname.setBackground(new Color(135,206,250)); 
        Lpassword.setFont(new Font("Agency FB", Font.BOLD , 30));
        Lpassword.setForeground(Color.WHITE);
        Lpassword.setBounds(30, 260,120, 50);
        JPpassword.setFont(new Font("Agency FB", Font.BOLD , 24));
        JPpassword.setForeground(Color.WHITE);
        JPpassword.setBounds(170, 270, 300, 40);
        JPpassword.setBackground(new Color(135,206,250));        
        login.add(Lname);
        login.add(TFname);
        login.add(Lpassword);
        login.add(JPpassword);
        LVersion.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 12));
        LVersion.setForeground(Color.WHITE);
        LVersion.setBounds(225, 500, 110, 50);
        login.add(LVersion);        
        Submit.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 24));
        Submit.setBackground(new Color(0, 191, 255));
        Submit.setForeground(Color.WHITE);
        Submit.setBounds(180, 370, 110, 50);
        login.add(Submit);
        Regis.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 24));
        Regis.setBackground(new Color(0, 191, 255));
        Regis.setBounds(350,370, 110, 50);
        Regis.setForeground(Color.WHITE);
        login.add(Regis);        
        Lbackground.setBounds(0, 0, 1200, 700);
        Lbackground.setIcon(background);
        login.add(Lbackground);
        content.setBounds(300, 0, 800, 650);
        login.add(content);       
    }
    
    public String getName(){
        return TFname.getText();
    }
    public String getPassword(){
        return JPpassword.getText();
    }
}
