package update;
public class MVCUpdate {
    public MVCUpdate(){
        UpdateView updateView = new UpdateView();
        UpdateModel updateModel = new UpdateModel();
        UpdateController updateController = new UpdateController(updateModel, updateView);
    }    
}