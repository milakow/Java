package edu.sda.java.advanced.abstraction.task;

public class Elephant extends Animal{

    public Elephant(String name) {
        super(name);
    }

    protected String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void move() {
        System.out.println("I am a " + name + " and I can run");
    }
}
