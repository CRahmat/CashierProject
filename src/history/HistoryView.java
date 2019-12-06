package history;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class HistoryView {
    JFrame layout = new JFrame("Transaction History");
    //LAYOUT
    JPanel homeBackground = new JPanel();
    JPanel header = new JPanel();
    JPanel content = new JPanel();
    JPanel plogo = new JPanel();
    JPanel pback = new JPanel();
    JSeparator JSLogo = new JSeparator();
    JSeparator JSInput = new JSeparator();
    JSeparator JSClock = new JSeparator();
    JLabel Llogo = new JLabel();
    JLabel Lback = new JLabel();
    JPanel ptime = new JPanel();
    
    JLabel Llist = new JLabel("TRANSACTION History");
    JLabel LKlist = new JLabel("Show Your History Transaction From Database");
    JLabel lclock = new JLabel();
    JLabel ldate = new JLabel();
    
    JTable listProduct;
    JScrollPane pList;
    DefaultTableModel tableModel;
    String colom[] = {"ID" , "DATE", "PRODUCT NAME", "QUANTITY", "PRICE"};

    ImageIcon ILogo = new ImageIcon(getClass().getResource("/img/logo.png"));
    ImageIcon IBack = new ImageIcon(getClass().getResource("/img/back.png"));
    HistoryView(){
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
        layout.setResizable(false); 
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
        
        Llist.setFont(new Font("Stencil",Font.CENTER_BASELINE,24));
        Llist.setForeground(Color.WHITE);
        Llist.setBounds(430,0,300,80);
        layout.add(Llist);
        
        JSInput.setBounds(400,60,350,10);
        layout.add(JSInput);
        LKlist.setFont(new Font("Agency FB",Font.CENTER_BASELINE,16));
        LKlist.setForeground(Color.WHITE);
        LKlist.setBounds(450,70,340,15);
        layout.add(LKlist);
       
        tableModel = new DefaultTableModel(colom, 24);
        listProduct = new JTable(tableModel);
        pList = new JScrollPane(listProduct);
        pList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pList.setBounds(50,170,1000,400);
        layout.add(pList);
        
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

