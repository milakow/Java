package org.advancedPart.abstractClass.citizen;

import java.util.ArrayList;
import java.util.Objects;

public class TownDemo {
    public static void main(String[] args) {

        King king = new King("Boleslaw");
        Soldier soldier1 = new Soldier("Jan");
        Soldier soldier2 = new Soldier("Stach");
        Townsman townsman1 = new Townsman("Darek");
        Townsman townsman2 = new Townsman("Arek");
        Peasant peasant1 = new Peasant("Wladek");
        Peasant peasant2 = new Peasant("Wiesiek");
        Peasant peasant3 = new Peasant("Mariusz");

        ArrayList<Citizen> citizens2 = new ArrayList<>();
        citizens2.add(king);
        citizens2.add(soldier1);
        citizens2.add(soldier2);
        citizens2.add(townsman1);
        citizens2.add(townsman2);
        citizens2.add(peasant1);
        citizens2.add(peasant2);
        citizens2.add(peasant3);
//        Citizen[] citizens = new Citizen[]{king,soldier1,soldier2,townsman1,townsman2,peasant1,peasant2,peasant3};

        Town town = new Town(citizens2);
        System.out.println(town.howManyCanVote());
        System.out.println(town.howManyCanVote());
        town.whoCanVote();

    }
}
