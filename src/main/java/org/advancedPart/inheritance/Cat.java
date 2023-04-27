package org.advancedPart.inheritance;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat() {
        super("Luna", 1);
        color = "black";
    }

    @Override
    public void makeSound() {
        System.out.println("meow! meow!....");
    }
//    public void meow() {
//        System.out.println("meow! meow!....");
//    }

    public void distractTheOwner() {
        System.out.println("Cat is distracting with its meowing");
//        meow();
//        meow();
//        meow();
//        meow();
//        meow();
        makeSound();
        makeSound();
        makeSound();
        makeSound();
        makeSound();
    }

    public void eatSomething() {
        super.eatSomething();
        System.out.println("this animal is cat ind it's eating mice");
    }
}
