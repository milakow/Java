package org.advancedPart.inheritance;

public class Cat extends Animal {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
        name = "Luna";
        age = 1;
        color = "black";
    }

    public void makeSound() {
        meow();
    }
    public void meow() {
        System.out.println("meow! meow!....");
    }

    public void distractTheOwner() {
        System.out.println("Cat is distracting with its meowing");
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
}
