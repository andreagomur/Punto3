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
public class CarModel {
 
    private Category category;
    private String modelNumber;
    private Make make;
    private int price;
    
    public CarModel(Category category, Make make, String modelNumber, int price ){
       this.category = category;
       this.make = make;
       this.modelNumber = modelNumber;
       this.price = price;
    }
    
    public Category getCategory(){
        return category;
    }
    
    public String getModelNumber(){
        return modelNumber;
    }
    
    public int getPrice(){
        return price;
    }
    
}
