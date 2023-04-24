package edu.sda.java.advanced.abstraction;

/**
 * Abstract class = cannot be instanitiated
 * which means we cannot make an object directly from this class
 *
 * Abstract class is "general definition of some type"
 * i.e. Animal and then special classes: Bird, Fish
 *
 * Each class extends some other class or extends class Object if no other class is extended
 */
public abstract class Car {

    private String vin;

    protected int noOfKms; //protected means = access for all classes in same package
    //AND access for all classes that EXTENDS from Car class

    public Car(String vin) {
        this.vin = vin;
    }

    public Car(String vin, int noOfKms) {
        this.vin = vin;
        this.noOfKms = noOfKms;
    }

    public String getVin() {

        return vin;
    }
//    public int noOfKms() {
//        return noOfKms();
//    }

    public abstract void runEngine();

    public abstract void fillFuel();

}

/**
 * your task is to create another class - ElectricCar and make it work and to use fillFuel method
 * in both non-abstract classes
 */