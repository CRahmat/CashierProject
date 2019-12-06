package registrasi;
import java.awt.*;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RegisView extends JFrame{    
    JFrame login = new JFrame("Register");    
    //LAYOUT
    JPanel loginBackground = new JPanel();
    JPanel sideBar = new JPanel();
    JPanel content = new JPanel();
    JPasswordField JPpassword = new JPasswordField();
    JLabel Lbackground = new JLabel();
    JLabel Llogo = new JLabel();
    JLabel LAdmin = new JLabel();
    JLabel Lname = new JLabel("Admin Name ");
    JLabel Laddress = new JLabel("Address ");
    JLabel Lgender = new JLabel("Gender");
    JLabel Ltelp = new JLabel("Telp");
    JLabel Lpassword = new JLabel("Password");    
    JTextField TFId = new JTextField();
    JTextField TFname = new JTextField();
    JTextField TFaddress = new JTextField();
    JTextField TFtelp = new JTextField();
    JTextField TFgender = new JTextField();    
    JButton Submit = new JButton("Register");
    JLabel LVersion = new JLabel("Cashier Application v.1.0.0");    
    ImageIcon logo = new ImageIcon(getClass().getResource("/img/Logo.png"));
    ImageIcon background = new ImageIcon(getClass().getResource("/img/BackgroundContent.jpg"));
    
    public RegisView() {
        initComponents();
        login.setSize(550,740);
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
        
        Lname.setFont(new Font("Agency FB", Font.BOLD , 20));
        Lname.setForeground(Color.WHITE);
        Lname.setBounds(70, 200, 90, 35);
        TFname.setFont(new Font("Agency FB", Font.BOLD , 20));
        TFname.setBounds(200, 200, 198, 35);        
        
        Laddress.setFont(new Font("Agency FB", Font.BOLD , 20));
        Laddress.setForeground(Color.WHITE);
        Laddress.setBounds(70, 260, 90, 35);
        TFaddress.setFont(new Font("Agency FB", Font.BOLD , 20));
        TFaddress.setBounds(200, 260, 198, 35);        
        
        Ltelp.setFont(new Font("Agency FB", Font.BOLD , 20));
        Ltelp.setForeground(Color.WHITE);
        Ltelp.setBounds(70, 380, 90, 35);
        TFtelp.setFont(new Font("Agency FB", Font.BOLD , 20));
        TFtelp.setBounds(200, 380, 198, 35);        
        
        Lpassword.setFont(new Font("Agency FB", Font.BOLD , 20));
        Lpassword.setForeground(Color.WHITE);
        Lpassword.setBounds(70, 440, 90, 35);
        JPpassword.setBounds(200, 440, 198, 35);
        JPpassword.setFont(new Font("Agency FB", Font.BOLD , 20));
        
        Lgender.setFont(new Font("Agency FB", Font.BOLD , 20));
        Lgender.setForeground(Color.WHITE);
        Lgender.setBounds(70, 320, 90, 35);
        TFgender.setFont(new Font("Agency FB", Font.BOLD , 20));
        TFgender.setBounds(200, 320, 198, 35);        
        
        login.add(Lname);
        login.add(TFname);
        login.add(Laddress);
        login.add(TFaddress);
        login.add(Lgender);
        login.add(TFgender);
        login.add(Ltelp);
        login.add(TFtelp);
        login.add(Lpassword);
        login.add(JPpassword);
        
        LVersion.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 12));
        LVersion.setForeground(Color.WHITE);
        LVersion.setBounds(235, 650, 110, 50);
        login.add(LVersion);        
        
        Submit.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 24));
        Submit.setBackground(new Color(135, 206, 240));
        Submit.setBounds(250, 550, 110, 50);
        login.add(Submit);
        
        Lbackground.setBounds(0, 0, 1200, 700);
        Lbackground.setIcon(background);
        login.add(Lbackground);
        content.setBounds(300, 0, 800, 650);
        login.add(content);       
    }
    
    public String getName(){
        return TFname.getText();
    }    
    public String getAddress(){
        return TFaddress.getText();
    }            
    public String getGender(){
        return TFgender.getText();
    }    
    public String getTelp(){
        return TFtelp.getText();
    }    
    public String getPassword(){
        return JPpassword.getText();
    }
}