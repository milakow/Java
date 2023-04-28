package org.advancedPart.abstractClass.citizen;

import java.util.ArrayList;
import java.util.Objects;

public class Town {
//    private Citizen[] citizens;
    private ArrayList<Citizen> citizens = new ArrayList<>();


    public Town(ArrayList<Citizen> citizens) {
        this.citizens = citizens;
    }

    public int howManyCanVote() {
        int counter = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter += 1;
            }
        }
        return counter;
    }

    public void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }
}
