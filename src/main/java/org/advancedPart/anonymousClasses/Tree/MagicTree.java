package org.advancedPart.anonymousClasses.Tree;

/**
 * Create a Tree object with the display() method, this method is supposed to print a "plain tree".
 * Create a list of 100 trees and name it forest. Using an anonymous class, add one special tree that will display "Magic Tree!".
 * Add them to the collection (some list) and shuffle the collection with the Collections.shuffle(List) method.
 * Iterate through the "forest" and display all the trees using the display() method :)
 * One of them should show a particular behavior, find it.
 */
public class MagicTree extends Tree {
    @Override
    public void display() {
        System.out.println("Magic Tree!!!");
    }
}

