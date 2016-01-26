/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class Customer extends Employee{
    
       
       private ArrayList<Order> orderHistory;
       
       public Customer(){
         orderHistory = new ArrayList<Order>();  
       }

    

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
    
}
