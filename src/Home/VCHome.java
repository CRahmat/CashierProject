package home;

import Home.HomeView;
import Home.HomeController;

/**
 *
 * @author Catur Rahmat
 */
public class VCHome {
    public VCHome() {
        HomeView homeView = new HomeView();
        HomeController homeController = new HomeController(homeView);
    }
    
    
}
