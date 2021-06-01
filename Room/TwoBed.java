package Room;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class TwoBed implements Room{  
    private final int price;
    private boolean wifi;
    private final int bed;
    
    public TwoBed() {
        price = 2000;
        wifi = true;
        bed = 2;
    }
    
    @Override
    public int getBed() {
        return bed;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
    
    @Override
    public void setWifiStatus(boolean wifi) {
        this.wifi = wifi;
    }
    
    @Override
    public boolean getWifiStatus() {
        return wifi;
    }
}
