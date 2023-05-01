package org.advancedPart.Tasks.ex7house;

public class Bed {
    private int counter;

    Bed(int counter) {
        this.counter = counter;
    }

    public void changeBedding() {
        counter = 0;
    }

    public boolean isItChanged() {
        return counter == 0;
    }

}
