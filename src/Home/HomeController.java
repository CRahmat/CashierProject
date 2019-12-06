package home;
import cashier.MVCCashier;
import delete.MVCDelete;
import history.MVCHistory;
import input.InputView;
import input.MVCInput;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import list.MVCList;
import login.LoginView;
import login.MVCLogin;
import profit.MVCProfit;
import update.MVCUpdate;

public class HomeController {
    HomeView homeView;
    HomeModel homeModel;
    public HomeController(HomeView homeView, HomeModel homeModel) {
        this.homeView = homeView;
        this.homeModel = homeModel;
        homeView.adminName.setText(homeModel.getAdminName());
        homeView.input.addMouseListener(new MouseAdapter() {            
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCInput mvcInput = new MVCInput();
            }
        });
        homeView.update.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCUpdate mvcUpdate = new MVCUpdate();
            }
        });
        homeView.logoutAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
            }
        });
        homeView.delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCDelete mvcDelete = new MVCDelete();
            }
        });
        homeView.list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCList mvcList = new MVCList();
            }
        });
        homeView.history.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
            MVCHistory mvcHistory = new MVCHistory();
            }
        });
        homeView.profit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCProfit mvcHistory = new MVCProfit();
            }
        });
        homeView.LAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCCashier mVCCashier = new MVCCashier();
            }
        });
        homeView.logoutAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                homeView.home.setVisible(false);
                MVCLogin login = new MVCLogin();
            }
        });
    }        
}