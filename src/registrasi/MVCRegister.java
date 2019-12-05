package registrasi;


import registrasi.RegisView;
import registrasi.RegisModel;

public class MVCRegister {    
    RegisModel regisModel = new RegisModel();
    RegisView regisView = new RegisView();
    RegisController rc = new RegisController(regisView, regisModel);
}