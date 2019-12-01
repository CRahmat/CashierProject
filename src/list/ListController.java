package list;

import home.VCHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import profit.ProfitModel;
import profit.ProfitView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class ListController {
    ListModel listModel;
   ListView listView;
    public ListController(ListModel listModel, ListView listView){
        this.listModel = listModel;
        this.listView = listView;
            listView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                listView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
    }
    
}
