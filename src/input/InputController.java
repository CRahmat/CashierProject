package input;

import home.VCHome;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class InputController {
    InputView inputView;
    InputModel inputModel;
    public InputController(InputView inputView, InputModel inputModel){
        this.inputModel = inputModel;
        this.inputView = inputView;
        
        inputView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                inputView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
        inputView.pinput.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseClicked(me);
                String productID = inputView.getIdProduct();
                String productName = inputView.getNameProduct();
                String productPrice = inputView.getPrice();
                String productProfit = inputView.getProfit();
                String productStock = inputView.getStock();
                inputModel.InputData(productID, productName, productPrice, productProfit, productStock);
            }
        
        });
        
        
    }
    
}
