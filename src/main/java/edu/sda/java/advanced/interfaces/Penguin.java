package edu.sda.java.advanced.interfaces;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "Well, penguins are not that much into flying :(";
    }
}
