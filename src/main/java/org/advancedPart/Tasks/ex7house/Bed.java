package org.advancedPart.Tasks.ex7house;

public class Bed {
    private int counter;

    Bed(int counter) {
        this.counter = counter;
    }

    public void changeBedding() {
        counter = 0;
    }

    public boolean isLinenChanged() {
        return counter == 0;
    }

    public int getCounter() {
        return counter;
    }
}
