package org.advancedPart.abstractClass.citizen;

public class Town {
    private Citizen[] citizens;

    public Town(Citizen[] citizens) {
        this.citizens = citizens;
    }

//    int counter;

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
