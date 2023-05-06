package org.advancedPart.anonymousClasses;

import org.advancedPart.anonymousClasses.Tree.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class TreeDemo {
    public static void main(String[] args) {
        List<Tree> forest = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Tree tree = new Tree();
            forest.add(tree);
        }
        Tree magickTree = new Tree(){
            @Override
            public void display() {
                System.out.println("Magic tree!");
            }
        };
        forest.add(magickTree);
        Collections.shuffle(forest);


        for (Tree tree : forest) {
            tree.display();
        }
    }
}
