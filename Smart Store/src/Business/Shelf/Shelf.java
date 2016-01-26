/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelf;

import Business.Item.ShelfItem;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class Shelf {
      private int shelfID;
      private ArrayList <ShelfItem> shelfList;
      private static int shelfCount = 1;
      
      public Shelf(){
          shelfList = new ArrayList<ShelfItem>();
          
          if(shelfCount >3)
          {
             shelfCount= shelfCount-3;
             
          } 
          shelfID = shelfCount;
          shelfCount++;
          
      }

    public int getShelfID() {
        return shelfID;
    }

    public ArrayList <ShelfItem> getShelfList() {
        return shelfList;
    }

    public void setShelfList(ArrayList <ShelfItem> shelfList) {
        this.shelfList = shelfList;
    }

    @Override
    public String toString() {
        return "Shelf " + shelfID;
    }
      
      
}
