/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

/**
 *
 * @author Catur Rahmat
 */
public class MVCCashier {
    CashierView cashierView = new CashierView();
    CashierModel cashireModel = new CashierModel();
    CashierController cashierController = new  CashierController(cashireModel,cashierView);  
}
