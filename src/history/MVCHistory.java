package history;
public class MVCHistory {
    public MVCHistory(){
        HistoryView historyView = new HistoryView();
        HistoryModel historyModel = new HistoryModel();
        HistoryController hc = new HistoryController(historyView,historyModel);
    }    
}
