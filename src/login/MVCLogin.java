package login;
import login.LoginView;
import login.LoginController;
import login.LoginModel;

public class MVCLogin {
    LoginModel loginModel = new LoginModel();
    LoginView loginView = new LoginView();
    LoginController lc = new LoginController(loginView, loginModel);
}
