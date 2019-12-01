package delete;

import home.VCHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Catur Rahmat
 */
public class DeleteController {
    DeleteView deleteView;
    DeleteModel deleteModel;
    public DeleteController(DeleteView deleteView, DeleteModel deleteModel){
        this.deleteModel = deleteModel;
        this.deleteView = deleteView;
        
        deleteView.pback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                super.mouseMoved(me);
                deleteView.layout.setVisible(false);
                VCHome vcHome = new VCHome();
            }
        });
        
    }
    
}
