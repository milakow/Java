package edu.sda.java.advanced.abstraction;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        /**
         * Anonymous class because WE DO NOT CREATE A SUBTYPE WITH PROPER CLASS NAME
         * We just locally create definitions of abstract methods and create an object
         * basing on that local methods definition
         * (we have one-time action and we want to run it --> that is when we use anonymous class
         */
        Car anonymous = new Car("ABCD") {
            @Override
            public void runEngine(){
                System.out.println("No idea for the engine, but let's go!");
            }

            @Override
            public void fillFuel() {
                System.out.println("Some random car filled");
            }
        };
        anonymous.runEngine();
        anonymous.fillFuel();
    }
}
