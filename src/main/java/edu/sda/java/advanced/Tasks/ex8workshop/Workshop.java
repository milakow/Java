package edu.sda.java.advanced.Tasks.ex8workshop;
import java.util.Random;


public class Workshop {
    private Wheel[] wheels;
    //    private Car car = new Car(wheels);
    private final Random random = new Random();

    //    double testedPressure;
    boolean acceptCarForRepair() {
        int numOfClients = random.nextInt(1, 10);
        return !(numOfClients > 15);
    }

    void repairCar(Wheel[] wheels) {
        for (Wheel wheel : wheels) {
//            if (!wheel.checkingWheelPressure(wheel.getPressure(), wheel.getAppropriatePressure())) {
//                System.out.println("Service for: " + wheel);
//                wheel.setPressure(wheel.getAppropriatePressure());
//            } else continue;
            if (wheel.getPressure() != wheel.getAppropriatePressure()) {
                System.out.println("Service for: " + wheel);
                wheel.setPressure(wheel.getAppropriatePressure());
            }
        }
    }
}

