package org.advancedPart.inheritance.animals;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eatSomething() {
        System.out.println("Animal is eating.");
    }

    //in abstract classes we can make abstract methods
    public abstract void makeSound();
}
