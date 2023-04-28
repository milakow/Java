package org.advancedPart.abstractClass.citizen;

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


        Citizen[] citizens = new Citizen[]{king,soldier1,soldier2,townsman1,townsman2,peasant1,peasant2,peasant3};

        Town town = new Town(citizens);
        System.out.println(town.howManyCanVote());
        System.out.println(town.howManyCanVote());
        town.whoCanVote();



    }
}
