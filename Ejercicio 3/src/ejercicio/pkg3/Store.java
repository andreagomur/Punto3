/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class Store {

    private Address address;    
    private ArrayList<Car> cars = new ArrayList<Car>();
    
    public Store(Address address) {
        this.address = address;
    }
    
    public  ArrayList<Car> getCarList(){
        return cars;
    }
    
    public Address getAddress(){
        return address;
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
