package list;
public class MVCList {
        public MVCList(){
        ListView listView = new ListView();
        ListModel listModel = new ListModel();
        ListController ic = new ListController(listModel, listView);
    }    
}