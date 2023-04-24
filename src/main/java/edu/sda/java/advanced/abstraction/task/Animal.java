package edu.sda.java.advanced.abstraction.task;

import javax.lang.model.element.AnnotationMirror;

/**
 * Create abstract class Animal
 * add field name to it
 * add method move() to it
 * Create subclasses of Animal: Bird, Fish, Elephant
 * set name though constructor
 * make a definition of move() in all of the classes
 * when running method move, print name of an animal and proper type of movenemt
 *
 * for Fish add an info if it's sea or sweet water fish
 * for Elephant - if it's african or from India
 * for Bird - if it can fly or not and if it migrates
 *
 * Make a demo out of all that
 * Make one anonymous implementation of Animal to create whale
 */

public abstract class Animal {
    protected String name;

    protected String animalInfo;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
