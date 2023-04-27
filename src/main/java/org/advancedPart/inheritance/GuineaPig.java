package org.advancedPart.inheritance;

public class GuineaPig extends Animal {

    private String name;
    private int age;
    private String race;

    public GuineaPig(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public GuineaPig() {
        name = "Tequila";
        age = 4;
        race = "crested";
    }

    public void makeSound() {
        sing();
    }

    public void sing() {
        System.out.println("kui kui");
    }

    public void biteCage() {
        System.out.println("I am biting my cage");
    }

    public void sleep() {
        System.out.println("It's time to sleep for me");
    }

    public void eatSomething() {
        super.eatSomething();
        System.out.println("My fav food is lettuce!");
    }

    @Override
    public String toString() {
        return "GuineaPig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }
}
