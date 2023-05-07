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
    /**
     * Add a LocalDate "date of production" to engine and another one to car
     * print them with other car data, but narrow engine to year and car to month and year of production
     *
     */

    private LocalDate dateOfProduction;

    private String fuelType;

    private float capacity;

    public Engine(){}
    public Engine(LocalDate dateOfProduction, String fuelType, float capacity) {
        this.dateOfProduction = dateOfProduction;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

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
        return "Fuel type: " + fuelType + ", capacity: " + capacity + ", date of production: " + dateOfProduction.getYear();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
