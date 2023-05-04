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
    Door door = new Door(false);
    Window window;
    Key key;

    public EscapeRoom(){}
    public EscapeRoom(Door door, Window window, Key key) {
        this.door = door;
        this.window = window;
        this.key = key;
    }

    public String tryToEscape() {
        String message = "";
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        System.out.println("You are in the room. Let's start the game!!!");

        while (door.isOpened == false) {
            System.out.println("What is your choice? (Pick one: window- w, key- k, door- d.): ");
            userChoice = scanner.nextLine();
            if (userChoice == "w") {
                System.out.println("Do you want to open or close the window? ");
                if (userChoice == "close") {
                    window.close();
//                    message = "The window is closed.";
                    System.out.println("The window is closed.");

                } else if (userChoice == "open") {
                    window.open();
//                    message = "The window is opened.";
                    System.out.println("The window is opened.");

                }
            } else if (userChoice == "k") {
                key.takeTheKey();
                message = "The key is taken.";

            } else if (userChoice == "d") {
                door.openTheDoor();
                message = "The door is opened. You win!!!";
            }
        }
        System.out.println("You win!");
        return message;
    }

}
