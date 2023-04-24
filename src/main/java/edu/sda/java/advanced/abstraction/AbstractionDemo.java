package edu.sda.java.advanced.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        /**
         * What you got used to
         */
        GasolineCar gasolineCar = new GasolineCar("XXXVVV", "Diesel");
        ElectricCar electricCar = new ElectricCar("ZZZYYY", "electricity");
        gasolineCar.runEngine();
        electricCar.fillFuel();

        /**
         * What is possible with abstractions and overriding methods
         *
         * We do not pay attention if we have electric car or gasoline car,
         * in each case what we care is if we can call runEngine and fillFuel methods
         * Each of them will have different way of refuelling, but that's no problem
         */
        Car car1 = new ElectricCar("UUUVVV", "electricity");
        car1.noOfKms = 455; //this is possible as noOfKms is protected
        Car car2 = new GasolineCar("qwerty", 322,"Benzine");
//        Car car3 = new ElectricCar("ZZXXCC", "electricity");
        ElectricCar car3 = new ElectricCar("ZZXXCC", "electricity");

        /**
         * Below we say to JVM "treat this car as ElectricCar" so that
         * I can call setNoOfKms method on it
         * as without that car3 has methods of "Car" class available, but not those from "ElectricCar"
         *
         */
//        ((ElectricCar)car3).setNoOfKms(500);
        car3.setNoOfKms(500);


        Car[] cars = new Car[]{car1, car2, car3};

        System.out.println("=====================");
        System.out.println("Loop over all cars");
        for (Car givencar : cars) {
            System.out.println(givencar.getVin());
            System.out.println(givencar.noOfKms);
            givencar.runEngine();
            givencar.fillFuel();
        }
    }
}
