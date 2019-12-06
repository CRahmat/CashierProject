package registrasi;
import registrasi.RegisView;
import registrasi.RegisModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import login.MVCLogin;

public class RegisController {
    RegisView regisView;
    RegisModel regisModel;
    
    public RegisController(RegisView regisView, RegisModel regisModel) {
        this.regisView = regisView;
        this.regisModel = regisModel;                        
        String data[][] = regisModel.getAll();    
        regisView.Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = regisView.getName();
                String address = regisView.getAddress();
                String gender = regisView.getGender();
                String telp = regisView.getTelp();
                String password = regisView.getPassword();
                regisModel.create(name, address, gender, telp, password);
                if(regisModel.isChecking() == false){
                String data[][] = regisModel.getAll();
                regisView.login.setVisible(false);
                MVCLogin mvcLogin = new MVCLogin();
                }else{
                    JOptionPane.showMessageDialog(null, "CANT CREATE ACCOUNT, USERNAME OR PASSWORD ALREADY EXIST");
                    regisView.setVisible(false);
                    new MVCRegister();
                }
            }
        });
    }
}
