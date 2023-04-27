package org.advancedPart.abstractClass.citizen;

public class Town {
    King king;
    Soldier soldier;
    Townsman townsman;
    Peasant peasant;

    Citizen[] citizens = new Citizen[]{king,soldier,townsman,peasant};

    int counter;

    public int howManyCanVote(Citizen... citizens) {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter += 1;
            }
        }
        return counter;
    }

    public String whoCanVote(Citizen... citizens) {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.name);
            }
        }
        return " ";
    }
}
