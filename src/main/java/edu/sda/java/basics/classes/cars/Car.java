package edu.sda.java.basics.classes.cars;

import edu.sda.java.basics.DateTime;
import edu.sda.java.basics.classes.cars.Engine;

import java.time.LocalDate;

public class Car {
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

    private LocalDate dateOfProduction;

    private String name;

    private String model;

    private Engine engine;

    String[] myTires = new String[3];

    //DOKONCZYC CONSTRUCTORY!!!

    public Car(){
//        this.name = name;
//        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String carInfo() {
        return "Name: " + name + ", model: " + model + " and engine: " + engine + ". Engine details: " + engine.getFuelType() + " and " + engine.getCapacity();
    }

}
