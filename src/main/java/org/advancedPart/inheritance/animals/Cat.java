package org.advancedPart.inheritance.animals;

public class Cat extends Animal implements Pet, Wild {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat() {
        super("Luna", 1);
        color = "black";
        eatSomething();
    }

    public void makeSound() {
        meow();
    }
    public void meow() {
        System.out.println("meow! meow!....");
    }

    public void distractTheOwner() {
        System.out.println(name + " is distracting with it's meowing...");
        meow();
        meow();
        meow();
        meow();
        meow();
    }

    public void eatSomething() {
        super.eatSomething();
        System.out.println("this animal is cat ind it's eating mice");
    }

    @Override
    public void pet() {
        System.out.println("at first cat is happy but than it attacks you");
        attack();
    }
    @Override
    public void attack() {
        System.out.println("cat attacks");
    }
}
