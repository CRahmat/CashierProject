
import java.awt.Color;
import javafx.scene.layout.Background;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Catur Rahmat
 */
public class HomeView {
    //CODE COLOR
    //SIDE BAR = 0,153,255
    // CONTENT = 0, 188, 242
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
    JPanel info = new JPanel();
    JPanel cashier = new JPanel();
    JSeparator search = new JSeparator();
    JLabel Lbackground = new JLabel();
    ImageIcon background = new ImageIcon(getClass().getResource("/img/BackgroundContent.jpg"));
    public HomeView() {
        initComponents();
        home.setSize(1100,650);
        home.setDefaultCloseOperation(EXIT_ON_CLOSE);
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setResizable(true);
        
    }
    public void initComponents(){
        home.add(Lbackground);
        home.add(homeBackground);
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
        //MENU BAR 2
        list.setBounds(350, 350, 200, 200);
        list.setBackground(new Color(135,206,250));
        home.add(list);
        history.setBounds(600, 350, 200, 200);
        history.setBackground(new Color(135,206,250));
        home.add(history);
        info.setBounds(850, 350, 200, 200);
        info.setBackground(new Color(135,206,250));
        home.add(info);
        search.setBounds(400, 50, 600, 50);
        home.add(search);
        
        //LAYOUT
        sideBar.setBounds(0, 0, 300, 650);
        sideBar.setBackground(new Color(0,153,255));
        home.add(sideBar);
        Lbackground.setBounds(300, 0, 800, 650);
        Lbackground.setIcon(background);
        home.add(Lbackground);
        content.setBounds(300, 0, 800, 650);
        home.add(content);
        
    }
}
