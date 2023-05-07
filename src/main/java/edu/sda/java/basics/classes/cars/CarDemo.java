package edu.sda.java.basics.classes.cars;

import java.time.LocalDate;

public class CarDemo {
    public static void  main(String[] args) {
        Car car1 = new Car();
        car1.setName("skoda");
        car1.setModel("fabia");
        car1.setDateOfProduction(LocalDate.of(2020, 6, 6));

        Engine engine = new Engine();
        engine.setFuelType("benzine");
        engine.setCapacity(1000);
        engine.setDateOfProduction(LocalDate.of(2020, 5, 5));
        car1.setEngine(engine);

        Tire tire1 = new Tire();
        Tire tire2 = new Tire();
        Tire tire3 = new Tire();
        Tire tire4 = new Tire();
        Tire[] tires = {tire1,tire2, tire3, tire4};

        Tire tire5  = new Tire();
        Tire tire6  = new Tire();
        Tire tire7  = new Tire();
        Tire tire8  = new Tire();
        Tire[] tires2 = {tire5, tire6, tire7, tire8};

        Engine engine2 = new Engine(LocalDate.of(2007, 5, 8), "diesel", 1);

        Car car2 = new Car(LocalDate.of(2010, 1, 12), "Toyota", "Yaris", engine2, tires2);


        car1.setMyTires(tires);

        System.out.println(car1.getName());
        System.out.println(car1.getEngine());
        System.out.println(car1.getModel());
        System.out.println(engine.engineInfo());
        System.out.println(car1.carInfo());

        System.out.println(car2.carInfo());
    }
}
