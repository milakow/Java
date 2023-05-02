package org.advancedPart.Tasks.ex1Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", 900, 1000);
        Car car2 = new Car("BMW", 500, 1000);

        System.out.println("Info about 1st car: ");
        car1.displayCarInfo();
        System.out.println("Info about 2st car: ");
        car2.displayCarInfo();

        System.out.println("Mileage for car1 after 120km: " + car1.increaseMileage(120));
        System.out.println("Mileage for car2 after 200km: " + car2.increaseMileage(200));

        System.out.println("Next service for car1 in: " + car1.distanceToGo() + "km");
        System.out.println("Next service for car2 in: " + car2.distanceToGo() +"km");

        //task3
        System.out.println("Task 3: ");
        Car car3 = new Car("Jeep", 32000);
        Car car4 = new Car("Kia");
        System.out.println("We have a new car: ");
        car3.displayCarInfo();
        System.out.println("We want to buy " + car4.getBrand());

        //task4
        System.out.println("Task 4: ");
        System.out.println(car2);

        //task5
        System.out.println("Task 5: ");
        System.out.println(car2.getBrand());


    }
}
