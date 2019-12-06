package profit;public class MVCProfit {
    public MVCProfit(){
        ProfitModel profitModel = new ProfitModel();
        ProfitView profitView = new ProfitView();
        ProfitController profitController = new ProfitController(profitModel, profitView);
    }   
}
