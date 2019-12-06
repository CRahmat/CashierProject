package delete;
public class MVCDelete {
        public MVCDelete(){
        DeleteView deleteView = new DeleteView();
        DeleteModel deleteModel = new DeleteModel();
        DeleteController dc = new DeleteController(deleteView, deleteModel);
    }    
}