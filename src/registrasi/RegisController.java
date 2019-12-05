import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
                String data[][] = regisModel.getAll();
            }
        });
    }
}
