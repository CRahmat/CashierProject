package cashier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */


import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Catur Rahmat
 */
public class CashierView {
    JFrame layout = new JFrame("Cashier Aplication");
    //LAYOUT
        String productName;
    String stock;
    String price;
    String totalShop;
    String productID;
    String change;
    
    JPanel homeBackground = new JPanel();
    JPanel header = new JPanel();
    JPanel content = new JPanel();
    JPanel plogo = new JPanel();
    JPanel pback = new JPanel();
    JPanel ptotal = new JPanel();
    
    JSeparator JSClock = new JSeparator();
    JSeparator JSInput = new JSeparator();
    JLabel Lcashier = new JLabel("CASHIER");
    JLabel LKcashier = new JLabel("Terima Kasih Telah Berbelanja, Selamat Datang Kembali");
    JLabel Llogo = new JLabel();
    JLabel Lback = new JLabel();
    JPanel ptime = new JPanel();
    
    
    JLabel lclock = new JLabel();
    JLabel ldate = new JLabel();
    JLabel ltotal = new JLabel("Rp ");
    JLabel lproductID = new JLabel("ID PRODUCT");
    JLabel lproductName = new JLabel("NAME");
    JLabel lstock = new JLabel("STOCK");
    JLabel lprice = new JLabel("PRICE");
    JLabel ljumlah = new JLabel("JUMLAH");
    
    JLabel ltotalPanel = new JLabel("TOTAL");
    JLabel lmoneyPanel = new JLabel("Rp 0, 00");
    
    JLabel ltotalShop = new JLabel("TOTAL");
    JLabel lmoney = new JLabel("MONEY");
    JLabel lchange = new JLabel("CHANGE");
    
    JTextField tfproductID = new JTextField();
    JTextField tfproductName = new JTextField();
    JTextField tfstock = new JTextField();
    JTextField tfprice = new JTextField();
    JTextField tfjumlah = new JTextField();
    
    JTextField tftotalShop = new JTextField("Rp 0, 00");
    JTextField tfmoney = new JTextField();
    JTextField tfchange = new JTextField();
    
    JTable listProduct;
    JScrollPane pList;
    DefaultTableModel tableModel;
    String colom[] = {"ID PRODUCT" , "NAME", "PRICE", "STOCK"};
    
    JTable listShop;
    JScrollPane pListShop;
    DefaultTableModel tableShop;
    String coloumShop[] = {"NO","PRODUCT","PRICE","COUNT"};
    

    ImageIcon ILogo = new ImageIcon(getClass().getResource("/img/logo.png"));
    ImageIcon IBack = new ImageIcon(getClass().getResource("/img/back.png"));
    public CashierView(){
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
        layout.setSize(1100,650);
        layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout.setVisible(true);
        layout.setLocationRelativeTo(null);
        layout.setResizable(false);
        initComponents();
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
        
        Lcashier.setFont(new Font("Stencil",Font.CENTER_BASELINE,32));
        Lcashier.setForeground(Color.WHITE);
        Lcashier.setBounds(500,0,300,80);
        layout.add(Lcashier);
        
        JSInput.setBounds(400,60,350,10);
        layout.add(JSInput);
        
        LKcashier.setFont(new Font("Agency FB",Font.CENTER_BASELINE,16));
        LKcashier.setForeground(Color.WHITE);
        LKcashier.setBounds(440,70,340,15);
        layout.add(LKcashier);
        
        lclock.setFont(new Font("DS-Digital",Font.CENTER_BASELINE,40));
        lclock.setForeground(new Color(0,0,0));
        lclock.setBounds(885,0,200,70);
        layout.add(lclock);
        
        ldate.setFont(new Font("DS-Digital",Font.CENTER_BASELINE,24));
        ldate.setForeground(new Color(0,0,0));
        ldate.setBounds(905,50,200,70);
        layout.add(ldate); 
        
        ptime.setSize(200, 120);
        ptime.setBounds(850,0,300,120);
        ptime.setBackground(new Color(64,224,208));
        layout.add(ptime);
        
        lprice.setFont(new Font("DS-Digital",Font.CENTER_BASELINE,74));
        lprice.setForeground(new Color(255, 0, 0));
        lprice.setBounds(400,40,300,80);
        layout.add(lprice);
        
        //DATABASE
        tableModel = new DefaultTableModel(colom, 30);
        listProduct = new JTable(tableModel);
        pList = new JScrollPane(listProduct);
        pList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pList.setBounds(695,120,400,500);
        layout.add(pList);
        
        //NON DATABASE
        tableShop = new DefaultTableModel(coloumShop, 20);
        listShop = new JTable(tableShop);
        pListShop = new JScrollPane(listShop);
        pListShop.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pListShop.setBounds(50,280,600,200);
        layout.add(pListShop);
        
        lproductID.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lproductID.setForeground(Color.WHITE);
        lproductID.setBounds(100,150,70,30);
        layout.add(lproductID);
        
        tfproductID.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfproductID.setBackground(new Color(176,224,230));
        tfproductID.setBounds(190,150,390,30);
        layout.add(tfproductID);
        
        lproductName.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lproductName.setForeground(Color.WHITE);
        lproductName.setBounds(100,190,70,30);
        layout.add(lproductName);
        
        tfproductName.setEditable(false);
        tfproductName.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfproductName.setBackground(new Color(176,224,230));
        tfproductName.setBounds(190,190,150,30);
        layout.add(tfproductName);
        
        lprice.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lprice.setForeground(Color.WHITE);
        lprice.setBounds(100,230,70,30);
        layout.add(lprice);
        
        tfprice.setEditable(false);
        tfprice.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfprice.setBackground(new Color(176,224,230));
        tfprice.setBounds(190,230,150,30);
        layout.add(tfprice);
        
        lstock.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lstock.setForeground(Color.WHITE);
        lstock.setBounds(360,190,70,30);
        layout.add(lstock);
        
        tfstock.setEditable(false);
        tfstock.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfstock.setBackground(new Color(176,224,230));
        tfstock.setBounds(430,190,150,30);
        layout.add(tfstock);
        
        ljumlah.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        ljumlah.setForeground(Color.WHITE);
        ljumlah.setBounds(360,230,70,30);
        layout.add(ljumlah);
        
        tfjumlah.setEditable(false);
        tfjumlah.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfjumlah.setBackground(new Color(176,224,230));
        tfjumlah.setBounds(430,230,150,30);
        layout.add(tfjumlah);
        
        lmoneyPanel.setFont(new Font("Agency FB",Font.CENTER_BASELINE,40));
        lmoneyPanel.setForeground(Color.RED);
        lmoneyPanel.setBounds(100,545,180,50);
        layout.add(lmoneyPanel);
        
        ltotalPanel.setFont(new Font("Agency FB",Font.CENTER_BASELINE,20));
        ltotalPanel.setForeground(Color.RED);
        ltotalPanel.setBounds(60,515,70,30);
        layout.add(ltotalPanel);
        
        ltotalShop.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        ltotalShop.setForeground(Color.WHITE);
        ltotalShop.setBounds(360,500,70,30);
        layout.add(ltotalShop);
        
        tftotalShop.setEditable(false);
        tftotalShop.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tftotalShop.setBackground(Color.WHITE);
        tftotalShop.setBounds(430,500,220,30);
        layout.add(tftotalShop);
        
        lmoney.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lmoney.setForeground(Color.WHITE);
        lmoney.setBounds(360,540,70,30);
        layout.add(lmoney);
        
        tfmoney.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfmoney.setBackground(Color.WHITE);
        tfmoney.setBounds(430,540,220,30);
        layout.add(tfmoney);
        
        lchange.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lchange.setForeground(Color.WHITE);
        lchange.setBounds(360,580,70,30);
        layout.add(lchange);
        
        tfchange.setEditable(false);
        tfchange.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        tfchange.setBackground(Color.WHITE);
        tfchange.setBounds(430,580,220,30);
        layout.add(tfchange);
        
        //setBounds(KIRI,ATAS,KANAN,BAWAH);
        header.setSize(1100, 200);
        header.setBounds(0,0,1100,120);
        header.setBackground(new Color(0,153,255));
        layout.add(header);
        ptotal.setBounds(50,500,300,110);
        ptotal.setBackground(Color.WHITE);
        layout.add(ptotal);
        content.setBounds(0,120,430,1100);
        content.setBackground(new Color(0, 188, 242));
        layout.add(content);
    }
    public void setproductName(String productName) {
        tfproductName.setText(productName);
    }

    public void setstock(String stock) {
        tfstock.setText(stock);
    }

    public void setprice(String price) {
        tfprice.setText(price);
    }

    public void settotalShop(String totalShop) {
        tftotalShop.setText("Rp "+totalShop);
        lmoneyPanel.setText("Rp "+totalShop);
    }
    public void setjumlahItem(String jumlahItem) {
        tfjumlah.setText(jumlahItem);
    }

    public String getproductID() {
        return tfproductID.getText();
    }
    public void setproductID(String productID) {
        tfproductID.setText(productID);
    }
    public void setMoney(String money){
        tfmoney.setText(money);
    }
}

