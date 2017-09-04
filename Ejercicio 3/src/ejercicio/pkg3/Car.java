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
public class Car {

    private CarModel model;
    private int traveled;

    public Car(CarModel model, int traveled) {
        this.model = model;
        this.traveled = traveled;
    }
    
    public CarModel getModel(){
        return model;
    }
    
    public int getTraveled(){
        return traveled;
    }
    
    public void setTraveled(int distance){
        this.traveled = distance;
    }
}
