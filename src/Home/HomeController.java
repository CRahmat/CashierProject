package Home;


import delete.MVCDelete;
import history.MVCHistory;
import input.InputView;
import input.MVCInput;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import list.MVCList;
import profit.MVCProfit;
import update.MVCUpdate;

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
        
    }
    
    
}
