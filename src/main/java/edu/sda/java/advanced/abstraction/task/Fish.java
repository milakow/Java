package edu.sda.java.advanced.abstraction.task;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }


    protected String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("I am  a " + name + " and I can swim");
    }
}
