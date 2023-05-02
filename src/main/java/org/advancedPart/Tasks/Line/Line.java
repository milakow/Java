package org.advancedPart.Tasks.Line;

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

    void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
        System.out.println("\n");
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length='" + length + '\'' +
                ", filling=" + filling +
                '}';
    }


}
