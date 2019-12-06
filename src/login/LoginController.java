package login;
import home.VCHome;
import registrasi.MVCRegister;
import login.LoginModel;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginController {
    LoginModel loginModel;
    LoginView loginView;
    public String admminName;

    
    public LoginController(LoginView loginView, LoginModel loginModel){
        this.loginModel = loginModel;
        this.loginView = loginView;
        loginModel.getCountAccount();
        loginView.Submit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String name = loginView.getName();
                String password = loginView.getPassword();
                loginModel.create(name, password);
                if(loginModel.isChecking() == true){
                    loginView.login.setVisible(false);
                    setAdmminName(admminName);
                    loginModel.setAdminName(name);
                    new VCHome();
                   
        }else{
         
                    JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD FAILED!!!");
                    loginView.login.setVisible(false);
                    new MVCLogin();
                    loginView.TFname.setText("");
                    loginView.JPpassword.setText("");
                    loginView.TFname.requestFocus();
        }
            }
        });
        loginView.Regis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                loginView.setVisible(false);
                MVCRegister mvcRegister = new MVCRegister();
            }
        });
    }

    public String getAdmminName() {
        return admminName;
    }

    public void setAdmminName(String admminName) {
        this.admminName = admminName;
    }


}
