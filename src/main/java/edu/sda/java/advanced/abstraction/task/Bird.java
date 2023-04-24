package edu.sda.java.advanced.abstraction.task;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    protected String movement;

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }




    @Override
    public void move() {
        System.out.println("I am a " + name + " and I can fly");
    }
}
