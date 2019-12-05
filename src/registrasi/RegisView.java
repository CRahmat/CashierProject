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
    //JRadioButton option1 = new JRadioButton("Man ");
    //JRadioButton option2 = new JRadioButton("Woman");
    
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
        Lname.setBounds(70, 200, 90, 50);
        TFname.setBounds(200, 215, 198, 25);
        
        Laddress.setFont(new Font("Agency FB", Font.BOLD , 20));
        Laddress.setForeground(Color.WHITE);
        Laddress.setBounds(70, 260, 90, 50);
        TFaddress.setBounds(200, 270, 198, 25);
        
        Ltelp.setFont(new Font("Agency FB", Font.BOLD , 20));
        Ltelp.setForeground(Color.WHITE);
        Ltelp.setBounds(70, 380, 90, 50);
        TFtelp.setBounds(200, 390, 198, 25);
        
        Lpassword.setFont(new Font("Agency FB", Font.BOLD , 20));
        Lpassword.setForeground(Color.WHITE);
        Lpassword.setBounds(70, 440, 90, 50);
        JPpassword.setBounds(200, 450, 198, 25);
        JPpassword.setBackground(Color.WHITE);
        
        Lgender.setFont(new Font("Agency FB", Font.BOLD , 20));
        Lgender.setForeground(Color.WHITE);
        Lgender.setBounds(70, 320, 90, 50);
        TFgender.setBounds(200, 330, 198, 25);
        /*option1.setFont(new Font("Agency FB", Font.BOLD, 20));
        option1.setForeground(Color.WHITE);
        option1.setBackground(Color.CYAN);
        option1.setBounds(200, 330, 90, 25);
        option2.setFont(new Font("Agency FB", Font.BOLD, 20));
        option2.setForeground(Color.WHITE);
        option2.setBackground(Color.CYAN);
        option2.setBounds(300, 330, 100, 25);
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
          */      
        
        
        login.add(Lname);
        login.add(TFname);
        login.add(Laddress);
        login.add(TFaddress);
        login.add(Lgender);
        login.add(TFgender);
        //login.add(option1);    
        //login.add(option2);
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
        Submit.setBounds(230, 550, 110, 50);
        login.add(Submit);
        Lbackground.setBounds(0, 0, 1200, 700);
        Lbackground.setIcon(background);
        login.add(Lbackground);
        content.setBounds(300, 0, 800, 650);
        login.add(content);       
    }
    public String getId(){
        return TFId.getText();
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
