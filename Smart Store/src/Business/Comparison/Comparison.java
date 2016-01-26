/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Comparison;

/**
 *
 * @author Prasad
 */
public class Comparison implements Comparable<Comparison> {
    
      private String string;
      private int number;

   

       public Comparison(String string,int number)
       {
                 this.string = string;
                 this.number= number;
               }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

      @Override
     public int compareTo(Comparison comparison) {
        if( this.number > comparison.getNumber()){
           return -1;
       }else if (this.number< comparison.getNumber()){
            return 1;
       }
        return 0;
    }
    
       
      
      

   
    
       
    
    
    
    
}
