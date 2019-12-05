/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KeSSA
 */
public class MVCLogin {
    LoginModel loginModel = new LoginModel();
    LoginView loginView = new LoginView();
    LoginController lc = new LoginController(loginView, loginModel);
}
