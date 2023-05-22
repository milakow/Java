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
public class Key {
    int numberOfKey;
    int numberOfTakenKey;

    public Key() {}
    public Key(int numberOfKey) {
        this.numberOfKey = numberOfKey;
    }

    public int takeTheKey() {
        numberOfTakenKey += 1;
        return numberOfKey = 0;
    }

    public int getNumberOfKey() {
        return numberOfKey;
    }

    public void setNumberOfKey(int numberOfKey) {
        this.numberOfKey = numberOfKey;
    }

    public int getNumberOfTakenKey() {
        return numberOfTakenKey;
    }

    public void setNumberOfTakenKey(int numberOfTakenKey) {
        this.numberOfTakenKey = numberOfTakenKey;
    }
}
