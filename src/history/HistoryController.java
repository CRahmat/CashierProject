package history;

import home.VCHome;
import input.InputModel;
import input.InputView;
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
public class HistoryController {
    
    HistoryView historyView;
    HistoryModel historyModel;
    public HistoryController(HistoryView historyView, HistoryModel historyModel){
        this.historyModel = historyModel;
        this.historyView = historyView;
        
        historyView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                historyView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
        
    }
    
}
