package PayBill;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public abstract class PayBill {
    protected PayBill pay;
    
    protected PayBill() {
        pay = null;
    }
    
    public abstract void pay();
    
}
