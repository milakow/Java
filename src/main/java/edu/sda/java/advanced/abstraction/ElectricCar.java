package edu.sda.java.advanced.abstraction;

public class ElectricCar extends Car {
    private String fuelType;

    public ElectricCar(String vin, String fuelType) {
        super(vin);
        this.fuelType = fuelType;
    }

    public void setNoOfKms(int noOfKms) {
        super.noOfKms = noOfKms; //yet another usage of "super" keyword - access methods and / or fields from superclass
    }

    @Override
    public void runEngine() {
        System.out.println("Engine is running, let's go!");
    }

    @Override
    public void fillFuel() {
        System.out.println("I am fully charged! ");

        /**
         * when passing object to println (or other methods that accept String as a parameter
         * by default method toString() is called
         */
        System.out.println(this.toString());
        //above and below we have same piece of code - toString is called by default
        System.out.println(this); //wypisze nazwe klasy oraz hashCode
    }
}
