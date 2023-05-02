package org.advancedPart.Tasks.ex8workshop;

public class WorkshopDemo {
    public static void main(String[] args) {

        Workshop workshop = new Workshop();

        Wheel wheel1 = new Wheel(2.0, 2.0, false);
        Wheel wheel2 = new Wheel(1.9, 2.0, false);
        Wheel wheel3 = new Wheel(2.0, 2.2, false);
        Wheel wheel4 = new Wheel(2.1, 2.2, false);

        Wheel[] wheels = new Wheel[]{wheel1,wheel2,wheel3,wheel4};

        Car car1 = new Car(wheels);
        car1.pretendAccident();
        for (Wheel wheel : car1.getWheels()) {
            System.out.println("Is wheel damaged?: " + wheel.isDamaged());
        }
        System.out.println("============================");
        boolean decision = workshop.acceptCarForRepair();

        System.out.println("Will the workshop accept the inspection of the car? " + decision);

        if (decision) {
            System.out.println(workshop.repairCar(car1));

        } else {
            System.out.println("We have too many customers right now");
        }




    }


}
