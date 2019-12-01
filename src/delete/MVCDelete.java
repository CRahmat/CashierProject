package delete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class MVCDelete {
        public MVCDelete(){
        DeleteView deleteView = new DeleteView();
        DeleteModel deleteModel = new DeleteModel();
        DeleteController dc = new DeleteController(deleteView, deleteModel);
    }
    
}
