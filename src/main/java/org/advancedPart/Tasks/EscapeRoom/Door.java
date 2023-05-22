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
public class Door {
    private Key key;
    private boolean isDoorOpened = false;

    public Door(boolean isOpened) {
        this.isDoorOpened = isOpened;
    }

    public void openTheDoor(Key key) {
        if (key.getNumberOfKey() == 0 && key.getNumberOfTakenKey() ==1) {
            isDoorOpened = true;
            System.out.println("You managed to open the door.");
            key.setNumberOfTakenKey(0);
        } else {
            System.out.println("You have to find the key!");
        }
    }

    public boolean isDoorOpened() {
        return isDoorOpened;
    }
}
