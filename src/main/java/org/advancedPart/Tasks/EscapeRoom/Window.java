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
public class Window {
    private boolean isWindowOpen;

    public Window (){}

    public Window(boolean isWindowOpen) {
        this.isWindowOpen = isWindowOpen;
    }

    public void changeWindowStatus() {
        if(isWindowOpen == true) {
             setWindowOpen(false);
        } else {
            setWindowOpen(true);
        }
    }
//    public boolean open() {
//        return isWindowOpen == true;
//    }
//    public boolean close() {
//        return isWindowOpen == false;
//    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    public void setWindowOpen(boolean isWindowOpen) {
        this.isWindowOpen = isWindowOpen;
    }
}
