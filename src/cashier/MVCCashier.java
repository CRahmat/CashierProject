package cashier;
public class MVCCashier {
    CashierView cashierView = new CashierView();
    CashierModel cashireModel = new CashierModel();
    CashierController cashierController = new  CashierController(cashireModel,cashierView);  
}
