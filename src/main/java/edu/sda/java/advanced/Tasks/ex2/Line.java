package edu.sda.java.advanced.Tasks.ex2;

import java.util.Random;

public class Line {
    private int length;

    private String filling;

    public Line(int length) {
        this.length = length;
    }
    public Line(String filling) {
        this.filling = filling;
    }

    public Line (int length, String filling) {
        this.length = length;
        this.filling = filling;
    }

    void printLines() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
    }


}
