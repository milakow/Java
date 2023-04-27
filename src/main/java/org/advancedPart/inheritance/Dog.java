package org.advancedPart.inheritance;

import java.util.Arrays;

public class Dog extends Animal {

    private String name;
    private int age;
    private String[] tricks;
    private int lastTrickIndex = 0;

    public Dog(String name, int age, int maxTTricks) {
        this.name = name;
        this.age = age;
        this.tricks = new String[maxTTricks];
    }

    public Dog() {
        name = "Bruno";
        age = 8;
        tricks = new String[3];
    }

    public void makeSound() {
        bark();
    }
    public void bark() {
        System.out.println("woof, woof");
    }

    public void teachDogNewTrick(String trick) {
        if (lastTrickIndex == tricks.length) {
            System.out.println("Sorry, this dog is old and cannot learn new tricks :(");
            bark();
            return;
        }
        tricks[lastTrickIndex++] = trick;
    }

    public void doTricks() {
        System.out.println("Dog do: ");
        for (String trick : tricks) {
            if (trick == null) {
                return;
            }
            System.out.println(trick);
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tricks=" + Arrays.toString(tricks) +
                ", lastTrickIndex=" + lastTrickIndex +
                '}';
    }

    public void eatSomething() {
        System.out.println("Dog is eating.");
    }
}
