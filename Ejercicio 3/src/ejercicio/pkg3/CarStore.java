/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class CarStore {
    
    private Store store;
    
    public void registerNewCar(){
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));                   
    }
   
    public void createStore(){
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                       
        Address address;              
        String county;
        String house;
        String postCode;        
                
        county = inputAString("Digite el condado de la tienda");
        house = inputAString("Digite la casa de la tienda");        
        postCode = inputAString("Digite el código postal de la tienda");        

        address = new Address(house, county, postCode);
        this.store = new Store(address);                                
    }
          
    public String inputAString(String message){
        String input="";
        
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        try{
            input = br.readLine();
            }catch(IOException io){
                System.out.println("Entrada no válida");                
            }                                        
        
        return input;
    }
    
    public int inputAnInt(String message){
        int input=0;
        
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        try{
            input = Integer.parseInt(br.readLine());
            }catch(IOException io){
                System.out.println("Entrada no válida");                
            }catch(NumberFormatException num){
                System.out.println("Debe digitar un número");
            }                                
        
        return input;        
    }
    
    public void registerCar(){
        Category category;
        
        String categoria;
        CarModel carModel;
        String modelNumber;
        int price;        
        Make make = new Make();
        
        int traveled;
        
        Car car;
        
        categoria = inputAString("Digite la categoría del carro");
        price = inputAnInt("Digite el precio del carro");
        modelNumber = inputAString("Digite el modelo del carro");
        
        category = new Category(categoria);      
        carModel = new CarModel(category, make, modelNumber, price);
        
        traveled = inputAnInt("Digite la distancia recoridda por el carro");
        
        car = new Car(carModel, traveled);        
        store.addCar(car);                

    }
    
    public void imprimirCarros(){
        
        ArrayList<Car> cars;
        cars = store.getCarList();
        
        System.out.println("Los carros registrados son: ");
        
        for (int i=0; i<cars.size();i++){
            System.out.println("Información del carro: " + i);
            System.out.println("La categoría del carro es: " + cars.get(i).getModel().getCategory().getName());
            System.out.println("El modelo del carro es: " + cars.get(i).getModel().getModelNumber());
            System.out.println("El precio del carro es: " + cars.get(i).getModel().getPrice());
            System.out.println("La distancia recorrida por el carro es: " + cars.get(i).getTraveled());
        }                    
        
    }
    
    public static void main(String args[]){
        CarStore carStore = new CarStore();
        carStore.createStore();     
        
        carStore.registerCar();
        carStore.imprimirCarros();
        
    }
}