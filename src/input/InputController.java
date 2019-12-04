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
        
        String data[][] = inputModel.findAllProduct();
            inputView.listProduct.setModel((new JTable(data, inputView.colom)).getModel());
            inputView.listProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mousePressed(e);
                    int row = inputView.listProduct.getSelectedRow();
                    int col = inputView.listProduct.getSelectedColumn();
                    inputView.listProduct.getValueAt(row,0).toString();
                }
                
});
            
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
                int price = Integer.parseInt(productPrice);
                String productProfit = inputView.getProfit();
                int profit = Integer.parseInt(productProfit);
                String productStock = inputView.getStock();
                int stock = Integer.parseInt(productStock);
                inputModel.InputData(productID, productName, price, profit, stock);
                 String data[][] = inputModel.findAllProduct();
                    inputView.listProduct.setModel((new JTable(data, inputView.colom)).getModel());
            }
        
        });
        
    }
        
    }
