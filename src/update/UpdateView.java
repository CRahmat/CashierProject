package update;


import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.SwingConstants.VERTICAL;


/**
 *
 * @author Catur Rahmat
 */
public class UpdateView {
    JFrame layout = new JFrame("Update Product");
    //LAYOUT
    JPanel homeBackground = new JPanel();
    JPanel header = new JPanel();
    JPanel content = new JPanel();
    JPanel plogo = new JPanel();
    JPanel pback = new JPanel();
    JPanel BScanner = new JPanel();
    JPanel pupdate = new JPanel();
    JSeparator JSLogo = new JSeparator();
    JSeparator JSInput = new JSeparator();
    JSeparator JSClock = new JSeparator();
    JSeparator JSUpdate = new JSeparator();
    JLabel Llogo = new JLabel();
    JPanel ptime = new JPanel();
    JLabel Lupdate = new JLabel("UPDATE PRODUCT");
    JLabel LKinput = new JLabel("Please Check Your Detail Product Before Update Your Product");
    JLabel lclock = new JLabel();
    JLabel ldate = new JLabel();
    JLabel Lback = new JLabel();
    JTextField tfIdProduct = new JTextField();
    JTextField tfProductName = new JTextField();
    JTextField tfProductPrice = new JTextField();
    JTextField tfStock = new JTextField();
    JTextField tfProfit = new JTextField();
    
    JTextField tfUpdateProductPrice = new JTextField();
    JTextField tfUpdateStock = new JTextField();
    JTextField tfUpdateProfit = new JTextField();
    
    JLabel lIdProduct = new JLabel("ID PRODUCT");
    JLabel lProductName = new JLabel("NAME");
    JLabel lProductPrice = new JLabel("PRICE");
    JLabel lProfit = new JLabel("PROFIT");
    JLabel lStock = new JLabel("STOCK");
    JLabel linputProduct = new JLabel("UPDATE PRODUCT");
    ImageIcon ILogo = new ImageIcon(getClass().getResource("/img/logo.png"));
    ImageIcon IBack = new ImageIcon(getClass().getResource("/img/back.png"));
    UpdateView(){
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
        
        Lupdate.setFont(new Font("Stencil",Font.CENTER_BASELINE,32));
        Lupdate.setForeground(Color.WHITE);
        Lupdate.setBounds(425,0,300,80);
        layout.add(Lupdate);
        
        JSInput.setBounds(400,60,350,10);
        layout.add(JSInput);
        LKinput.setFont(new Font("Agency FB",Font.CENTER_BASELINE,16));
        LKinput.setForeground(Color.WHITE);
        LKinput.setBounds(420,70,340,15);
        layout.add(LKinput);
        
        BScanner.setBounds(35,150,400,430);
        BScanner.setBackground(Color.DARK_GRAY);
        layout.add(BScanner);
        
        
        lIdProduct.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lIdProduct.setForeground(Color.WHITE);
        lIdProduct.setBounds(520,170,80,40);
        layout.add(lIdProduct);
        
        tfIdProduct.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfIdProduct.setBackground(new Color(176,224,230));
        tfIdProduct.setBounds(630,170,350,40);
        layout.add(tfIdProduct);
        
        lProductName.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lProductName.setForeground(Color.WHITE);
        lProductName.setBounds(520,240,80,40);
        layout.add(lProductName);
        
        tfProductName.setEditable(false);
        tfProductName.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfProductName.setBackground(new Color(176,224,230));
        tfProductName.setBounds(630,240,350,40);
        layout.add(tfProductName);
        
        JSUpdate.setBounds(450, 290, 620, 10);
        layout.add(JSUpdate);
        
        lProductPrice.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lProductPrice.setForeground(Color.WHITE);
        lProductPrice.setBounds(470,310,80,40);
        layout.add(lProductPrice);
        
        tfProductPrice.setEditable(false);
        tfProductPrice.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfProductPrice.setBackground(new Color(176,224,230));
        tfProductPrice.setBounds(550,310,230,40);
        layout.add(tfProductPrice);
        
        lProfit.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lProfit.setForeground(Color.WHITE);
        lProfit.setBounds(470,380,80,40);
        layout.add(lProfit);
        
        tfProfit.setEditable(false);
        tfProfit.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfProfit.setBackground(new Color(176,224,230));
        tfProfit.setBounds(550,380,230,40);
        layout.add( tfProfit);
        
        lStock.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        lStock.setForeground(Color.WHITE);
        lStock.setBounds(470,450,80,40);
        layout.add(lStock);
        
        tfStock.setEditable(false);
        tfStock.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfStock.setBackground(new Color(176,224,230));
        tfStock.setBounds(550,450,230,40);
        layout.add( tfStock);
        
        tfUpdateProductPrice.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfUpdateProductPrice.setBackground(new Color(176,224,230));
        tfUpdateProductPrice.setBounds(800,310,230,40);
        layout.add(tfUpdateProductPrice);
        
        tfUpdateProfit.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
        tfUpdateProfit.setBackground(new Color(176,224,230));
        tfUpdateProfit.setBounds(800,380,230,40);
        layout.add(tfUpdateProfit);
        

        tfUpdateStock.setFont(new Font("Agency FB",Font.TYPE1_FONT,18));
         tfUpdateStock.setBackground(new Color(176,224,230));
         tfUpdateStock.setBounds(800,450,230,40);
        layout.add(tfUpdateStock);
        
        linputProduct.setFont(new Font("Agency FB",Font.CENTER_BASELINE,18));
        linputProduct.setForeground(Color.BLACK);
        linputProduct.setBounds(740,520,250,40);
        layout.add(linputProduct);
        
        
        
        pupdate.setBounds(575,520,425,40);
        pupdate.setBackground(Color.WHITE);
        layout.add(pupdate);
       
        
        //setBounds(KIRI,ATAS,KANAN,BAWAH);
        header.setSize(1100, 200);
        header.setBounds(0,0,1100,120);
        header.setBackground(new Color(0,153,255));
        layout.add(header);
        content.setBounds(0,120,430,1100);
        content.setBackground(new Color(0, 188, 242));
    }
    public String getIdProduct(){
        return tfIdProduct.getText();
    }
    public void setNameProduct(String ProductName){
        tfProductName.setText(ProductName);
    }
        public String getPrice(){
        return tfProductPrice.getText();
    }
    public String getStock(){
        return tfStock.getText();
    }
    public String getProfit(){
        return tfProfit.getText();
    }
    public void setPrice(String Price){
        tfProductPrice.setText(Price);
    }
    public void setStock(String Stock){
        tfStock.setText(Stock);
    }
    public void setProfit(String Profit){
        tfProfit.setText(Profit);
    }
    
}
