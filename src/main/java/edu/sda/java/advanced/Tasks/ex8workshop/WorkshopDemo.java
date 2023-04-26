package edu.sda.java.advanced.Tasks.ex8workshop;

import java.sql.SQLOutput;

public class WorkshopDemo {
    public static void main(String[] args) {

        Workshop workshop = new Workshop();

        Receipt receipt = new Receipt();

        Wheel wheel1 = new Wheel(2.0, 2.0);
        Wheel wheel2 = new Wheel(1.9, 2.0);
        Wheel wheel3 = new Wheel(2.0, 2.2);
        Wheel wheel4 = new Wheel(2.1, 2.2);

        Wheel[] wheels = new Wheel[]{wheel1,wheel2,wheel3,wheel4};

        Car car1 = new Car(wheels);

        boolean decision = workshop.acceptCarForRepair();

        System.out.println("Will the workshop accept the inspection of the car? " + decision);

        if (decision) {
            workshop.repairCar(wheels);
            //generating receipt
        } else {
            System.out.println("We have too many customers right now");
        }


    }


}
