
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class DeleteView {
    JFrame layout = new JFrame("Delete Product");
    //LAYOUT
    JPanel homeBackground = new JPanel();
    JPanel header = new JPanel();
    JPanel content = new JPanel();
    JPanel plogo = new JPanel();
    JPanel pback = new JPanel();
    JPanel BScanner = new JPanel();
    JPanel pdelete = new JPanel();
    JSeparator JSLogo = new JSeparator();
    JSeparator JSInput = new JSeparator();
    JSeparator JSClock = new JSeparator();
    JLabel Llogo = new JLabel();
    JLabel Lback = new JLabel();
    JPanel ptime = new JPanel();
    
    JLabel Lupdate = new JLabel("DELETE PRODUCT");
    JLabel LKdelete = new JLabel("Please Check Again Before Upload Your Product");
    JLabel lclock = new JLabel();
    JLabel ldate = new JLabel();
    
    JTextField tfIdProduct = new JTextField();
    JTextField tfProductName = new JTextField();

    
    JLabel lIdProduct = new JLabel("ID PRODUCT");
    JLabel lProductName = new JLabel("NAME");

    JLabel ldeleteProduct = new JLabel("DELETE PRODUCT");
    ImageIcon ILogo = new ImageIcon(getClass().getResource("/img/logo.png"));
    ImageIcon IBack = new ImageIcon(getClass().getResource("/img/back.png"));
    DeleteView(){
        Thread clock = new Thread(){
        @Override
        public void run(){
            while(true){
                DateFormat Date = new SimpleDateFormat("dd - MM - yyyy");
                String theDate = Date.format(new Date()).toString();
                DateFormat Clock = new SimpleDateFormat("hh : mm : ss");
                String theClock = Clock.format(new Date()).toString();
                lclock.setText(theClock);
                ldate.setText(theDate);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            }   
        }
        };
        clock.start();
        initComponents();
        layout.setSize(1100,650);
        layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout.setVisible(true);
        layout.setLocationRelativeTo(null);
        layout.setResizable(true); 
    }
    public void initComponents(){
        layout.add(homeBackground);
        Llogo.setBounds(50,10,200,100);
        Llogo.setIcon(ILogo);
        layout.add(Llogo);
        
        Lback.setBounds(7,0,40,25);
        Lback.setIcon(IBack);
        layout.add(Lback);
        
        pback.setBounds(0,0,40,25);
        pback.setBackground(new Color(64,224,208));
        layout.add(pback);
        
        plogo.setSize(200, 120);
        plogo.setBounds(0,0,300,120);
        plogo.setBackground(new Color(64,224,208));
        layout.add(plogo);
        
        lclock.setFont(new Font("DS-Digital",Font.CENTER_BASELINE,40));
        lclock.setForeground(new Color(0,0,0));
        lclock.setBounds(885,0,200,70);
        layout.add(lclock);
        
        ldate.setFont(new Font("DS-Digital",Font.CENTER_BASELINE,24));
        ldate.setForeground(new Color(0,0,0));
        ldate.setBounds(905,50,200,70);
        layout.add(ldate);
        
        JSLogo.setBounds(865,60,205,10);
        layout.add(JSLogo);
        
        ptime.setSize(200, 120);
        ptime.setBounds(850,0,300,120);
        ptime.setBackground(new Color(64,224,208));
        layout.add(ptime);
        
        Lupdate.setFont(new Font("Stencil",Font.CENTER_BASELINE,32));
        Lupdate.setForeground(Color.WHITE);
        Lupdate.setBounds(430,0,300,80);
        layout.add(Lupdate);
        
        JSInput.setBounds(400,60,350,10);
        layout.add(JSInput);
        
        LKdelete.setFont(new Font("Agency FB",Font.CENTER_BASELINE,16));
        LKdelete.setForeground(Color.WHITE);
        LKdelete.setBounds(455,70,340,15);
        layout.add(LKdelete);
        
        BScanner.setBounds(35,150,400,430);
        BScanner.setBackground(Color.DARK_GRAY);
        layout.add(BScanner);
        
        lIdProduct.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lIdProduct.setForeground(Color.WHITE);
        lIdProduct.setBounds(730,200,80,40);
        layout.add(lIdProduct);
        
        tfIdProduct.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfIdProduct.setBackground(new Color(176,224,230));
        tfIdProduct.setBounds(550,240,420,40);
        layout.add(tfIdProduct);
        
        lProductName.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lProductName.setForeground(Color.WHITE);
        lProductName.setBounds(740,320,80,40);
        layout.add(lProductName);
        
        tfProductName.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfProductName.setBackground(new Color(176,224,230));
        tfProductName.setBounds(550,360,420,40);
        layout.add(tfProductName);
        
        ldeleteProduct.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        ldeleteProduct.setForeground(Color.BLACK);
        ldeleteProduct.setBounds(720,480,250,40);
        layout.add(ldeleteProduct);
        
        pdelete.setBounds(575,480,370,40);
        pdelete.setBackground(Color.WHITE);
        layout.add(pdelete);
       
        
        //setBounds(KIRI,ATAS,KANAN,BAWAH);
        header.setSize(1100, 200);
        header.setBounds(0,0,1100,120);
        header.setBackground(new Color(0,153,255));
        layout.add(header);
        content.setBounds(0,120,430,1100);
        content.setBackground(new Color(0, 188, 242));
        layout.add(content);
        
    }
    
}
