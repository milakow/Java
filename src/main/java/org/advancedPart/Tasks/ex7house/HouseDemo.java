package org.advancedPart.Tasks.ex7house;

public class HouseDemo {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        Window window4 = new Window();

        Window[] windows = new Window[]{window1,window2,window3,window4};

        Window[] windows2 = new Window[]{window1, window2};

        for (Window window : windows) {
            System.out.println("Is this window open?: " + window.isOpen());
        }

//        System.out.println("Opening 4 windows: ");
//        for (Window window : windows) {
//            window.open();
//            System.out.println("Is this window open?: " + window.isOpen());
//        }

        System.out.println("Creating and cleaning rooms: ");
        Bed bed1 = new Bed(4);
        Bed bed2 = new Bed(5);

        Room room1 = new Room(bed1, windows);
        Room room2 = new Room(bed2, windows2);

        room1.cleanRoom();
        room2.cleanRoom();

        System.out.println("bed2 counter equals: " + bed2.getCounter());
        for (Window window : windows) {
            System.out.println("Is this window open?: " + window.isOpen());
        }
        System.out.println("Creating a house: ");
        Room[] rooms = new Room[]{room1, room2};
        House house = new House(rooms);
        for (Room r : rooms) {
            System.out.println(r);
        }
    }
}
