package org.advancedPart.enums.CarExample;
import org.advancedPart.enums.CarExample.Intersection;

import java.util.Scanner;

public class Car {

    public void drive(Intersection intersection) {
        Direction correctDirection = intersection.getCorrectDirection();

        switch (correctDirection) {
            case LEFT:
                System.out.println("goes left");
                break;
            case RIGHT:
                System.out.println("goes right");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("intersection type: " + intersection.getCorrectDirection());
        System.out.println("Where to go?");
        System.out.println("Possible values:");
        Direction[] values = Direction.values();
        for (Direction value : values) {
            System.out.println(value);
        }
        String whichSideToGo = scanner.nextLine();


        if (correctDirection.getViewName().equals(whichSideToGo)) {
            System.out.println("You pass safely");
        }else{
            System.out.println("it's accident!");
        }

    }


}
