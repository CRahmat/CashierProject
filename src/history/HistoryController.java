package history;

import home.VCHome;
import input.InputModel;
import input.InputView;
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
public class HistoryController {
    
    HistoryView historyView;
    HistoryModel historyModel;
    public HistoryController(HistoryView historyView, HistoryModel historyModel){
        this.historyModel = historyModel;
        this.historyView = historyView;
        
            String data[][] = historyModel.findAllProduct();
            historyView.listProduct.setModel((new JTable(data, historyView.colom)).getModel());
            historyView.listProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mousePressed(e);
                    int row = historyView.listProduct.getSelectedRow();
                    int col = historyView.listProduct.getSelectedColumn();
                    String nama = historyView.listProduct.getValueAt(row,0).toString();
                }
                
});
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
