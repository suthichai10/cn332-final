
import Login.Biometric;
import Login.GoogleLogin;
import PayBill.Money;
import PayBill.PromptPay;
import Room.OneBed;
import Room.TwoBed;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class ApplicationMain {
    public static void main(String[] args) throws ParseException {
        //create Hotel
        Hotel hotel = new Hotel();
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        //Create new promotion
        Promotion promotion = new Promotion(sdformat.parse("2021-06-01") , sdformat.parse("2021-06-07"),20 , "Summer Discount");
        
        Customer c1 = new Customer(null,new OneBed(),new Money());
        hotel.addCustomer(c1);
        c1.login(new Biometric());
        //Display All Customer in the Hotel
        System.out.println("====== Customer ======");
        hotel.DisplayAllCustomer();
        System.out.println("total customer : " + hotel.totalCustomer());
        
        Customer c2 = new Customer(promotion,new TwoBed(),new PromptPay());
        hotel.addCustomer(c2);
        c2.login(new GoogleLogin());
        
        System.out.println("====== Customer ======");
        hotel.DisplayAllCustomer();
        System.out.println("total customer : " + hotel.totalCustomer());
        
        System.out.println("===========================");
        //c1 checkout hotel
        double price = c1.checkOut();
        System.out.println("C1 price : " + price);
        hotel.removeCustomer(c1);
        System.out.println("====== Customer ======");
        hotel.DisplayAllCustomer();
        System.out.println("total customer : " + hotel.totalCustomer());
        
        System.out.println("===========================");
        //c2 checkout hotel
        double price2 = c2.checkOut();
        System.out.println("C2 price : " + price2);
        hotel.removeCustomer(c2);
        System.out.println("====== Customer ======");
        hotel.DisplayAllCustomer();
        System.out.println("total customer : " + hotel.totalCustomer());
    }
}
