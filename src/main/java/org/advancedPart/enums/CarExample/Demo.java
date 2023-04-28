package org.advancedPart.enums.CarExample;
import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Intersection intersection = new Intersection(Direction.LEFT);
        Intersection intersection2 = new Intersection(Direction.RIGHT);

        Car car = new Car();

//        car.drive(intersection);
//        car.drive(intersection2);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Direction direction = Direction.valueOf("RIGHT");
        System.out.println(direction.getDegrees());

        System.out.println(direction.ordinal());
        System.out.println(direction.name());
    }
}
