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

    }
}
