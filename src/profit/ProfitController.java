package profit;

import home.VCHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Catur Rahmat
 */
public class ProfitController {
    ProfitModel profitModel;
    ProfitView profitView;
    public ProfitController(ProfitModel profitModel, ProfitView profitView){
        this.profitModel = profitModel;
        this.profitView = profitView;
            profitView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                profitView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
    }
    
    
}
