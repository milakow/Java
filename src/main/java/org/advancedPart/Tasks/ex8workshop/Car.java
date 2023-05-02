package org.advancedPart.Tasks.ex8workshop;

import java.util.Random;

public class Car {

    Wheel[] wheels;

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void pretendAccident() {
        Random random = new Random();
        int number = random.nextInt(1, 5);
            for (int i = 0; i < number; i++) {
                wheels[i].setPressure(0.0);
                wheels[i].setDamaged(true);
            }
    }

    public Wheel[] getWheels() {
        return wheels;
    }
}
