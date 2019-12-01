package Main;

import Home.HomeController;
import Home.HomeView;
    public class Main {
    public static void main(String[] args) {
        HomeView hv;
        hv = new HomeView();
        HomeController hc;
        hc = new HomeController(hv);
    }
    
}
