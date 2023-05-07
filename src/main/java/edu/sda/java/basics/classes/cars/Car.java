package edu.sda.java.basics.classes.cars;

import edu.sda.java.basics.DateTime;
import edu.sda.java.basics.classes.cars.Engine;

import java.time.LocalDate;
import java.util.Arrays;

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

    Tire[] myTires;

    //DOKONCZYC CONSTRUCTORY!!!


    public Car() {
    }

    public Car(String name, String model, Engine engine, Tire[] myTires) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.myTires = myTires;
    }

    public Car(LocalDate dateOfProduction, String name, String model, Engine engine, Tire[] myTires) {
        this.dateOfProduction = dateOfProduction;
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.myTires = myTires;
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

    public Tire[] getMyTires() {
        return myTires;
    }

    public void setMyTires(Tire[] myTires) {
        this.myTires = myTires;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String carInfo() {
        return "Name: " + name + ", model: " + model + " and engine: " + engine + ". Engine details: " + engine.getFuelType() + " and " + engine.getCapacity() + ". Car was produced in year " + dateOfProduction.getYear() + " in month " + dateOfProduction.getMonth();
    }

    @Override
    public String toString() {
        return "Car{" +
                "myTires=" + Arrays.toString(myTires) +
                '}';
    }
}
