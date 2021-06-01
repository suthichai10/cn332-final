/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author sutic
 */
public class Hotel {
    private int customerCount;
    private ArrayList<Customer> customer;
    
    public Hotel() {
        customerCount = 0;
        customer = new ArrayList<>();
    }
    
    public void addCustomer(Customer c) {
        customer.add(c);
        customerCount++;
    }
    
    public void removeCustomer(Customer c) {
        customer.remove(c);
        customerCount--;
    }
    
    public int totalCustomer() {
        return customerCount;
    }
    
    public void DisplayAllCustomer() {
        for(Customer c : customer) {
            System.out.println(c.toString());
        }
    }
}
