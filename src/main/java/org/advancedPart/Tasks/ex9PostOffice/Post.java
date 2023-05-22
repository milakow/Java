package org.advancedPart.Tasks.ex9PostOffice;

/**
 * Add a method that will allow us to send packages.
 * The method is supposed to require you to hand over a package and an amount of money.
 * The method accepting the package should check its price, and if enough money has been paid, it should change package status to "shipped" and return the rest.
 * If there was not enough money, return them all and don’t modify the condition of the package.
 * Add the "takings" field to the post and add the money earned by the post to it.
 */
public class Post {
    private Packet packet;
    private double money;
    private double takings;

    public Post(Packet packet, double money) {
        this.packet = packet;
        this.money = money;
    }

    public void sendPacket(Packet packet, double money) {
        takings += money;
        if (money < packet.getPriceOfPackage()){
            takings -= money;
            System.out.println("You paid not enough money.");
        } else if (money > packet.getPriceOfPackage()) {
            double rest = money - packet.getPriceOfPackage();
            takings += packet.getPriceOfPackage();
            packet.setStatus(Status.SHIPPED);
            System.out.println("Current status of package: " + packet.getStatus() + ". Get the rest of the money: " + rest + "PLN.");
        } else if (money == packet.getPriceOfPackage()) {
            takings += money;
            packet.setStatus(Status.SHIPPED);
            System.out.println("Current status of package: " + packet.getStatus() + ". The amount of entered money is equal to the value of the shipment.");
        }
    }

    public double getTakings() {
        return takings;
    }
}
