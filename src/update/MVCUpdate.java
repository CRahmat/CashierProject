package update;
/**
 *
 * @author Catur Rahmat
 */
public class MVCUpdate {
    public MVCUpdate(){
        UpdateView updateView = new UpdateView();
        UpdateModel updateModel = new UpdateModel();
        UpdateController updateController = new UpdateController(updateModel, updateView);
    }
    
}
