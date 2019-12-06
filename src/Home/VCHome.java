package home;

public class VCHome {
    public VCHome() {
        HomeView homeView = new HomeView();
        HomeModel homeModel = new HomeModel();
        HomeController homeController = new HomeController(homeView, homeModel);
    }        
}