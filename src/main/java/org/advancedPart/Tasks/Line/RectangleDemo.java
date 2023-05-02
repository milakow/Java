package org.advancedPart.Tasks.Line;

/**
 * more difficult variant: create a Rectangle class, and give it the following properties:
 * height, width and filling. In main prepare 2 objects of this type and define (initialize)
 * the values in their fields. Create an analogous method as for the line, which will print
 * the rectangle using the information contained in its properties.
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6, 8, "@");
        rectangle1.printRectangle();
        System.out.println("\n");

        Rectangle rectangle2 = new Rectangle(3, 7, "!");
        rectangle2.printRectangle();
        System.out.println("\n");


    }
}
