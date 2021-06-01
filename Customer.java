
import Login.Authentication;
import Room.Room;
import PayBill.PayBill;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class Customer {
    private final Date checkIn;
    private final Promotion promotion;
    private final Room room;
    private final PayBill pay;
    private Authentication auth;
    
    public Customer(Promotion promotion , Room room , PayBill pay) {
        checkIn = new Date();
        this.promotion = promotion;
        this.room = room;
        this.pay = pay;
    }
    
    public void login(Authentication auth) {
        this.auth = auth;
    }
    
    public double checkOut() {
        Date checkOut = new Date();
        if(promotion != null) {
            double discount = room.getPrice() * (promotion.getDiscount()/100);
            return room.getPrice()-discount;
        }
        return room.getPrice();
    }
    
    @Override
    public String toString() {
        if(promotion != null) {
            return "CheckIn : " + checkIn + " Room : " + room.getClass().getSimpleName() + " PayBill : " + pay.getClass().getSimpleName() + " Promotion : " + promotion.getPromotionName();
        }
        return "CheckIn : " + checkIn + " Room : " + room.getClass().getSimpleName() + " PayBill : " + pay.getClass().getSimpleName();
    }
}
