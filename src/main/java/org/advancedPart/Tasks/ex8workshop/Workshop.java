package org.advancedPart.Tasks.ex8workshop;
import java.util.Random;


public class Workshop {

    Receipt receipt = new Receipt();
    private final Random random = new Random();

    //    double testedPressure;
    boolean acceptCarForRepair() {
        int numOfClients = random.nextInt(1, 10);
        return !(numOfClients > 15);
    }

    public String repairCar(Car car) {
        int amount = 0;
        for (Wheel wheel : car.getWheels()) {
            if (wheel.isDamaged()) {
                wheel.setPressure(wheel.getAppropriatePressure());
                wheel.setDamaged(false);
                receipt.setTypeOfService("Reparing wheel");
                amount += 1;
            }
            receipt.setAmount(amount);
        }
        return receipt.displayReceipt(receipt.getTypeOfService(), receipt.getAmount());
    }
}

