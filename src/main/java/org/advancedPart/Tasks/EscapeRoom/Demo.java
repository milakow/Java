package org.advancedPart.Tasks.EscapeRoom;
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
public class Demo {
    public static void main(String[] args) {
//        Door door1 = new Door();
        Window window1 = new Window();
        Key key1 = new Key();

//        EscapeRoom escapeRoom = new EscapeRoom(Door door, Window window, Key key);
        EscapeRoom escapeRoom = new EscapeRoom();
        escapeRoom.tryToEscape();
//        System.out.println(escapeRoom.tryToEscape().);
    }
}
