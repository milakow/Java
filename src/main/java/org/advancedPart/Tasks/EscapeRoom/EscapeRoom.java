package org.advancedPart.Tasks.EscapeRoom;

import java.util.Scanner;

/**
 * Design a program where the user will be in the room. There will be items in it: a door, a window and a key.
 * The user can interact with one of the selected items multiple times (use the Scanner tool).
 * The game ends when he manages to open the door.
 * If the user uses:
 * window:  will open or close,
 * key: -the user will take the key and the key will no longer appear as one of the options,
 * the door: -will open but only if the user has taken the key, otherwise it will remain locked.
 *
 * An appropriate message should be displayed each time you try to use the object.
 */
public class EscapeRoom {
    private Door door = new Door(false);
    private Window window;
    private Key key;

    public EscapeRoom(){}
    public EscapeRoom(Door door, Window window, Key key) {
        this.door = door;
        this.window = window;
        this.key = key;
    }

    public void tryToEscape() {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        System.out.println("You are in the room. Let's start the game!!!");

        label:
        while (!door.isDoorOpened()) {
            System.out.println("What is your choice? (Pick one: window- w, key- k, door- d.): ");
            userChoice = scanner.nextLine();

            switch (userChoice) {
                case "w" -> {
                    window.changeWindowStatus();
                    if (window.isWindowOpen() == false) {
                        System.out.println("The window is closed.");
                    } else if (window.isWindowOpen() == true) {
                        System.out.println("The window is opened, but you can't go out here!");
                    }
                }
                case "k" -> {
                    key.takeTheKey();
                    System.out.println("The key is taken.");
                }
                case "d" -> {
                    if (key.getNumberOfTakenKey() == 0) {
                        System.out.println("You don't have a key! Try again");
                    } else if (key.getNumberOfTakenKey() == 1) {
                        door.openTheDoor(key);
                        System.out.println("The door is opened!");
                        break label;
                    }
                }
                default -> {
                    System.out.println("I don't know what you want to use. Repeat :)");
                }
            }

        }
        System.out.println("You win!");
    }

}
