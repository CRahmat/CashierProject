import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginController {
    LoginModel loginModel;
    LoginView loginView;
    MVCRegister mvcRegister;
    
    public LoginController(LoginView loginView, LoginModel loginModel){
        this.loginModel = loginModel;
        this.loginView = loginView;
        
        //String data[][] = loginModel.getAll();
        
        loginView.Submit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String name = loginView.getName();
                String password = loginView.getPassword();
                loginModel.create(name, password);
                //String data[][] = loginModel.getAll();
            }
        });
        
        loginView.Regis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                MVCRegister mvcRegister = new MVCRegister();
            }
        });
    }
}
