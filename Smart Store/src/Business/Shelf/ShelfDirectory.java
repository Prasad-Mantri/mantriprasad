/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelf;

import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class ShelfDirectory {
    private ArrayList<Shelf> ShelfDirectory;
    
    
    public ShelfDirectory(){
        ShelfDirectory = new ArrayList<Shelf>();
    }

    public ArrayList<Shelf> getShelfDirectory() {
        return ShelfDirectory;
    }

    public void setShelfDirectory(ArrayList<Shelf> ShelfDirectory) {
        this.ShelfDirectory = ShelfDirectory;
    }
    
    
}
