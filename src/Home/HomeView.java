package Home;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Catur Rahmat
 */
public class HomeView {
    //CODE COLOR
    //SIDE BAR = 0,153,255
    //CONTENT = 0, 188, 242
    JFrame home = new JFrame("Home");
    //LAYOUT
    JPanel homeBackground = new JPanel();
    JPanel sideBar = new JPanel();
    JPanel content = new JPanel();
    //MENU BAR
    JPanel input = new JPanel();
    JPanel update = new JPanel();
    JPanel delete = new JPanel();
    JPanel list = new JPanel();
    JPanel history = new JPanel();
    JPanel profit = new JPanel();
    JPanel cashier = new JPanel();
    JPanel logoutAdmin = new JPanel();
    JSeparator search = new JSeparator();
    JSeparator buttomLogo = new JSeparator();
    JSeparator JSadminName = new JSeparator();
    JLabel Lbackground = new JLabel();
    JLabel Llogo = new JLabel();
    JLabel LAdmin = new JLabel();
    JLabel LadminName = new JLabel("Admin Name ");
    JLabel Llogout = new JLabel("Log Out");
    JLabel LVersion = new JLabel("Cashier Application v.1.0.0");
    JLabel LKinput = new JLabel("INPUT");
    JLabel LKupdate = new JLabel("UPDATE");
    JLabel LKdelete = new JLabel("DELETE");
    JLabel LKIinput = new JLabel("Input Product To Database");
    JLabel LKIupdate = new JLabel("Update Product In Database");
    JLabel LKIdelete = new JLabel("Delete Product In Database");
    JLabel LKIlist = new JLabel("Show Product From Database");
    JLabel LKIhistory = new JLabel("List History Transaction");
    JLabel LKIprofit = new JLabel("Profit Company");
    JLabel LKlist = new JLabel("LIST");
    JLabel LKhistory = new JLabel("HISTORY");
    JLabel LKprofit= new JLabel("PROFIT");
    JLabel LsearchProduct = new JLabel("Search Product with Name or Barode Scanner ...");
    JLabel LSearch = new JLabel();
    JLabel Linput = new JLabel();
    JLabel Lupdate = new JLabel();
    JLabel Ldelete = new JLabel();
    JLabel Lhistory = new JLabel();
    JLabel Llist = new JLabel();
    JLabel Lprofit = new JLabel();
    JSeparator JSinput = new JSeparator();
    JSeparator JSupdate = new JSeparator();
    JSeparator JSdelete = new JSeparator();
    JSeparator JShistory = new JSeparator();
    JSeparator JSlist = new JSeparator();
    JSeparator JSprofit = new JSeparator();
    
    ImageIcon logo = new ImageIcon(getClass().getResource("/img/Logo.png"));
    ImageIcon background = new ImageIcon(getClass().getResource("/img/BackgroundContent.jpg"));
    ImageIcon admin = new ImageIcon(getClass().getResource("/img/Cashier.png"));
    ImageIcon logout = new ImageIcon(getClass().getResource("/img/logout.png"));
    ImageIcon Search = new ImageIcon(getClass().getResource("/img/search.png"));
    ImageIcon Input = new ImageIcon(getClass().getResource("/img/input.png"));
    ImageIcon Update = new ImageIcon(getClass().getResource("/img/update.png"));
    ImageIcon Delete = new ImageIcon(getClass().getResource("/img/delete.png"));
    ImageIcon List = new ImageIcon(getClass().getResource("/img/list.png"));
    ImageIcon History = new ImageIcon(getClass().getResource("/img/history.png"));
    ImageIcon Profit = new ImageIcon(getClass().getResource("/img/profit.png"));
    public HomeView() {
        initComponents();
        home.setSize(1100,650);
        home.setDefaultCloseOperation(EXIT_ON_CLOSE);
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setResizable(false);
        
    }
    public void initComponents(){
        home.add(Lbackground);
        home.add(homeBackground);
        //LOGO MENU BAR
        Linput.setBounds(418, 130, 64, 64);
        Linput.setIcon(Input);
        home.add(Linput);
        Lupdate.setBounds(668, 130, 64, 64);
        Lupdate.setIcon(Update);
        home.add(Lupdate);
        Ldelete.setBounds(918, 130, 64, 64);
        Ldelete.setIcon(Delete);
        home.add(Ldelete);
        Llist.setBounds(418, 380, 64, 64);
        Llist.setIcon(List);
        home.add(Llist);
        Lhistory.setBounds(668, 380, 64, 64);
        Lhistory.setIcon(History);
        home.add(Lhistory);
        Lprofit.setBounds(918, 380, 64, 64);
        Lprofit.setIcon(Profit);
        home.add(Lprofit);
        home.add(JSdelete);
        //JSeparator MENU BAR 1
        JSinput.setBounds(365, 230, 170, 10);
        home.add(JSinput);
        JSupdate.setBounds(615, 230, 170, 10);
        home.add(JSupdate);
        JSdelete.setBounds(865, 230, 170, 10);
        //Label MENU BAR 1
        LKinput.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKinput.setForeground(Color.WHITE);
        LKinput.setBounds(425, 235, 50, 20);
        home.add(LKinput);
        LKupdate.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKupdate.setForeground(Color.WHITE);
        LKupdate.setBounds(668, 235, 65, 20);
        home.add(LKupdate);
        LKdelete.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKdelete.setForeground(Color.WHITE);
        LKdelete.setBounds(920, 235, 60, 20);
        home.add(LKdelete);
        //Info Label BAR 1
        LKIinput.setFont(new Font("Agency FB", Font.ROMAN_BASELINE , 16));
        LKIinput.setForeground(Color.WHITE);
        LKIinput.setBounds(390, 265, 150, 20);
        home.add(LKIinput);
        LKIupdate.setFont(new Font("Agency FB",Font.ROMAN_BASELINE , 16));
        LKIupdate.setForeground(Color.WHITE);
        LKIupdate.setBounds(638, 265, 150, 20);
        home.add(LKIupdate);
        LKIdelete.setFont(new Font("Agency FB",Font.ROMAN_BASELINE , 16));
        LKIdelete.setForeground(Color.WHITE);
        LKIdelete.setBounds(890, 265, 150, 20);
        home.add(LKIdelete);
        //MENU BAR 1
        input.setBounds(350, 100, 200, 200);
        input.setBackground(new Color(135,206,250));
        home.add(input);
        update.setBounds(600, 100, 200, 200);
        update.setBackground(new Color(135,206,250));
        home.add(update);
        delete.setBounds(850, 100, 200, 200);
        delete.setBackground(new Color(135,206,250));
        home.add(delete);
        //JSeparator Menu 2
        JSlist.setBounds(365, 480, 170, 10);
        home.add(JSlist);
        JShistory.setBounds(615, 480, 170, 10);
        home.add(JShistory);
        JSprofit.setBounds(865, 480, 170, 10);
        home.add(JSprofit);
        //Info Label BAR 2
        LKIlist.setFont(new Font("Agency FB", Font.ROMAN_BASELINE , 16));
        LKIlist.setForeground(Color.WHITE);
        LKIlist.setBounds(385, 515, 150, 20);
        home.add(LKIlist);
        LKIhistory.setFont(new Font("Agency FB",Font.ROMAN_BASELINE , 16));
        LKIhistory.setForeground(Color.WHITE);
        LKIhistory.setBounds(650, 515, 150, 20);
        home.add(LKIhistory);
        LKIprofit.setFont(new Font("Agency FB",Font.ROMAN_BASELINE , 16));
        LKIprofit.setForeground(Color.WHITE);
        LKIprofit.setBounds(915, 515, 150, 20);
        home.add(LKIprofit);
        //Label MENU BAR 2
        LKlist.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKlist.setForeground(Color.WHITE);
        LKlist.setBounds(432, 485, 50, 20);
        home.add(LKlist);
        LKhistory.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKhistory.setForeground(Color.WHITE);
        LKhistory.setBounds(665, 485, 70, 20);
        home.add(LKhistory);
        LKprofit.setFont(new Font("Agency FB", Font.BOLD , 24));
        LKprofit.setForeground(Color.WHITE);
        LKprofit.setBounds(920, 485, 60, 20);
        home.add(LKprofit);
        
        //MENU BAR 2
        list.setBounds(350, 350, 200, 200);
        list.setBackground(new Color(135,206,250));
        home.add(list);
        history.setBounds(600, 350, 200, 200);
        history.setBackground(new Color(135,206,250));
        home.add(history);
        profit.setBounds(850, 350, 200, 200);
        profit.setBackground(new Color(135,206,250));
        home.add(profit);
        //SEPARATOR
        search.setBounds(400, 60, 600, 50);
        home.add(search);
        buttomLogo.setBounds(10, 130, 280, 10);
        home.add( buttomLogo);
        //LOGO
        Llogo.setBounds(50, 20, 200, 100);
        Llogo.setIcon(logo);
        home.add(Llogo);
        
        LAdmin.setBounds(50, 160, 200, 200);
        LAdmin.setIcon(admin);
        home.add(LAdmin);
        //ADMIN INFO
        LadminName.setFont(new Font("Agency FB", Font.BOLD , 16));
        LadminName.setForeground(Color.WHITE);
        LadminName.setBounds(20, 380, 70, 50);
        JSadminName.setBounds(92, 410, 178, 50);
        home.add(LadminName);
        home.add(JSadminName);
        LVersion.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 12));
        LVersion.setForeground(Color.WHITE);
        LVersion.setBounds(95, 570, 110, 50);
        home.add(LVersion);
        
        LSearch.setBounds(410, 25, 32, 32);
        LSearch.setIcon(Search);
        home.add(LSearch);
        LsearchProduct.setFont(new Font("Agency FB",Font.ROMAN_BASELINE , 16));
        LsearchProduct.setForeground(Color.BLACK);
        LsearchProduct.setBounds(450, 30, 300, 20);
        home.add(LsearchProduct);
        //SIDE BAR
        Llogout.setFont(new Font("Agency FB", Font.CENTER_BASELINE , 24));
        Llogout.setForeground(Color.WHITE);
        Llogout.setBounds(120, 500, 110, 50);
        home.add(Llogout);
        logoutAdmin.setBounds(50, 500, 200, 50);
        logoutAdmin.setBackground(new Color(135,206,250));
        home.add(logoutAdmin);
        //SIDE BAR LAYOUT
        sideBar.setBounds(0, 0, 300, 650);
        sideBar.setBackground(new Color(0,153,255));
        home.add(sideBar);
        //CONTENT LAYOUT
        Lbackground.setBounds(300, 0, 800, 650);
        Lbackground.setIcon(background);
        home.add(Lbackground);
        content.setBounds(300, 0, 800, 650);
        home.add(content);
        
    }
}
