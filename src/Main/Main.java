package Main;

import Connection.DatabaseConnection;
import Home.HomeController;
import Home.HomeView;
    public class Main {
    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        HomeView hv;
        hv = new HomeView();
        HomeController hc;
        hc = new HomeController(hv);
    }
    
}
