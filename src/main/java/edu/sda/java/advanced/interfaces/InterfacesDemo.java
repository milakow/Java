package edu.sda.java.advanced.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Drone drone = new Drone("AX");
        Bird bird = new Bird("Eagle");
        Penguin penguin = new Penguin("Dyzio");

        System.out.println(drone.fly());
        System.out.println(bird.fly());
        System.out.println(penguin.fly());

        System.out.println("=======================");
        Flying drone2 = new Drone("ZY");
        Flying bird2 = new Bird("Falcon");
        Flying penguin2 = new Penguin("Coco");

        System.out.println(drone2.fly());
        System.out.println(bird2.fly());
        System.out.println(penguin2.fly());
    }
}
