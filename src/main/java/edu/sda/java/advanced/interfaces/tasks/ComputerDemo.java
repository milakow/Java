package edu.sda.java.advanced.interfaces.tasks;

public class ComputerDemo {
    public static void main(String[] args) {
//        Computer computer = new Computer("Computer", ConnectionType.ETHERNET);
        Desktop desktop = new Desktop("Acer", "ENT");
        Laptop laptop = new Laptop("HP", "wifi");
        Laptop laptop2 = new Laptop("Asus", ConnectionType.WIFI);

        System.out.println(desktop.connect());
        System.out.println(laptop.connect());
        System.out.println("type of desktop: " + desktop.getType());
        System.out.println("type of laptop: " + laptop.getType());
        System.out.println("==========================");

    }
}
