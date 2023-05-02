package org.advancedPart.Tasks.Line;

/**
 * more difficult variant: create a Rectangle class, and give it the following properties:
 * height, width and filling. In main prepare 2 objects of this type and define (initialize)
 * the values in their fields. Create an analogous method as for the line, which will print
 * the rectangle using the information contained in its properties.
 */
public class Rectangle {

    private int height;
    private int length;
    private String filling;

    public Rectangle(int height, int length, String filling) {
        this.height = height;
        this.length = length;
        this.filling = filling;
    }

    public void printRectangle() {
        String space = " ";
        for (int k = 0; k < length; k++) {
            System.out.print(filling);
        }
        for (int j = 0; j < height-2; j++) {
            System.out.print("\n" + filling);
            for (int l = 0; l < length -2; l++) {
                System.out.print(space);
            }
            System.out.print(filling);
        }
        System.out.print("\n");
        for (int k = 0; k < length; k++) {
            System.out.print(filling);
        }
    }
}
