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
public interface Room {
    public int getBed();
    public int getPrice();
    public void setWifiStatus(boolean wifi);
    public boolean getWifiStatus();
}
