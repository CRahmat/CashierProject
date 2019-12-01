package update;

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
public class UpdateController {
    UpdateModel updateModel;
    UpdateView updateView;
    public UpdateController(UpdateModel updateModel, UpdateView updateView){
        this.updateModel = updateModel;
        this.updateView = updateView;
    updateView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                updateView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
        
    }
    
}
