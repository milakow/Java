package org.advancedPart.anonymousClasses.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Create a Tree object with the display() method, this method is supposed to print a "plain tree".
 * Create a list of 100 trees and name it forest. Using an anonymous class, add one special tree that will display "Magic Tree!".
 * Add them to the collection (some list) and shuffle the collection with the Collections.shuffle(List) method.
 * Iterate through the "forest" and display all the trees using the display() method :)
 * One of them should show a particular behavior, find it.
 */
public class Demo {
    public static void main(String[] args) {
        List<Tree> forest = new LinkedList<>();

        for (int i = 0; i < 101; i++) {
            forest.add(new Tree());
        }
        forest.add(new MagicTree());
        Collections.shuffle(forest);

        for (Tree tree : forest){
            tree.display();
        }
    }
}


