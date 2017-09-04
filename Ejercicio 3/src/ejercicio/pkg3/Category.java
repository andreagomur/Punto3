/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author Andrea
 */
public class Category {
    
    private String category;
    
    Category(String aCategory) {
        this.category = aCategory;
    }
    
    public String getName(){
        return this.category;
    }
}
