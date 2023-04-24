package edu.sda.java.basics.classes.cars;

public class CarDemo {

    public static void  main(String[] args) {
        Car car1 = new Car();
        car1.setName("skoda");
        car1.setModel("fabia");
        Engine engine = new Engine();
        engine.setFuelType("benzine");
        engine.setCapacity(1000);
        car1.setEngine(engine);



    }
}
