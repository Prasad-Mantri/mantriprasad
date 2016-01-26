/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author Prasad
 */
public class StoreOrder extends Order{
   
      private int sorderNumber;
      private boolean storeManagerApproval = false;
       private boolean cityAheadApproval = false;
      
      private static int oscount = 1;
      
      public StoreOrder() {
        
        sorderNumber = oscount;
        oscount++;
    }

    public int getSorderNumber() {
        return sorderNumber;
    }

    public void setSorderNumber(int sorderNumber) {
        this.sorderNumber = sorderNumber;
    }

    public boolean isStoreManagerApproval() {
        return storeManagerApproval;
    }

    public void setStoreManagerApproval(boolean storeManagerApproval) {
        this.storeManagerApproval = storeManagerApproval;
    }

    public boolean isCityAheadApproval() {
        return cityAheadApproval;
    }

    public void setCityAheadApproval(boolean cityAheadApproval) {
        this.cityAheadApproval = cityAheadApproval;
    }
      
}
