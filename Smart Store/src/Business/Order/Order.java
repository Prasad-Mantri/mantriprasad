/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Item.OrderItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Prasad
 */
public class Order {
    private ArrayList<OrderItem> itemList;
    private int orderNumber; 
    private float totalCost;
    private String timeStamp;
    
    private static int ocount = 1;

    public Order() {
        itemList = new ArrayList<OrderItem>();
        orderNumber = ocount;
        ocount++;
    }

    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<OrderItem> itemList) {
        this.itemList = itemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    
       public String getTimestamp() {
        return timeStamp;
    }

    public void setTimeStamp() {
        this.timeStamp = new SimpleDateFormat("MM.dd.yyyy  HH.mm.ss").format(new Date());
    }

    @Override
    public String toString() {
        return timeStamp;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    
    
}
