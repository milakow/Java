package org.advancedPart.inheritance.animals;

public class Mouse extends Animal implements Pet, Wild {
    public Mouse(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bip, bip!");
    }

    @Override
    public void pet() {
        System.out.println("Mouse is happy!");
    }

    @Override
    public void attack() {
        System.out.println("mouse attacks and than run away");
    }
}
