package input;
public class MVCInput {
    public MVCInput(){
        InputView inputView = new InputView();
        InputModel inputModel = new InputModel();
        InputController ic = new InputController(inputView,inputModel);
    }    
}