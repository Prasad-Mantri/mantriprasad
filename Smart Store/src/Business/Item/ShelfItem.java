/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Item;

/**
 *
 * @author Prasad
 */
public class ShelfItem extends Item{
    
   private int threshold=10;
   
   
   @Override
    public String toString() {
        return Product.getName();
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
