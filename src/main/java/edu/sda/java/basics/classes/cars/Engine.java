package edu.sda.java.basics.classes.cars;

import java.time.LocalDate;
import java.time.Year;

public class  Engine {
    private int Year;
    /**Create new package "cars"
     create class Car with name, model, engine
     create class Engine with fuel type and capacity

     ---

     in both classes create getters and setters
     in class Engine create method engineInfo returning it's parameters - fuel type and capacity
     in class Car create method carInfo returning all it's parameters, including engine params

     --

     create another package (may be subpackage) "tires"
     create class Tire in that package with field "tireName", getter and setter
     add a table of Tires in class Car
     */

//    LocalDate dateOfProduction = LocalDate.of(java.time.Year);

    private LocalDate dateOfProduction;

    private String fuelType;

    private float capacity;


    public LocalDate getDateOfProduction() {return dateOfProduction; }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String engineInfo() {
        return "Fuel type: " + fuelType + ", capacity: " + capacity;
    }

}
