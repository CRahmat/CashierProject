
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class HomeController {
    HomeView homeView;

    public HomeController(HomeView homeView) {
        this.homeView = homeView;
        homeView.input.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
                    super.mouseClicked(e);
                    homeView.input.setBackground(new Color(0,0,0));
                }
        
        
        
        });
    }
    
    
}
