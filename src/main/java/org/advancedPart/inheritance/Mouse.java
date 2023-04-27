package org.advancedPart.inheritance;

public class Mouse extends Animal{
    public Mouse(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bip, bip!");
    }
}
