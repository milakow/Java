package edu.sda.java.advanced.Tasks.ex7house;

/**
 * In this task, you will have to create several objects, give them appropriate properties (fields),
 * prepare constructors imposing the appropriate way of completing these characteristics
 * and one behavior (method). After creating each object, prepare the toString method for it
 * and test in main whether building project and the object methods works correctly,
 * i.e. the object's features have the appropriate values.
 *
 * Make a separate package in which you will implement the following:
 * Window objects can be open or closed.
 * The newly created window is closed but can be opened later.
 * Prepare an array of four windows in the program and open all the windows.
 * Bed type objects have a counter on how many days have passed since the last change of bed linen.
 * Each time you create a bed, you need to provide how many days ago the bedding was changed (don't use Scanner, only constructor parameters).
 * Room type objects have one bed and an array of windows.
 * There are two ways to create a room object. Passing the bed and window arrays and the second one using a parameterless constructor.
 * When you’re using the second way, in the room should be an array with two windows and a bed that has not been changed for five days.
 * The room can be cleaned by calling the appropriate method. It is supposed to change the sheets and open all the windows.
 * House objects have an array of rooms.
 * To create a house you need to pass rooms through the constructor.
 * In the program create a house with two rooms: one default and the other, larger, with four windows.
 */
public class Window {
    String state = "closed";

    Window(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }




}
