package advancedDevelopment.task7;

/**
 * Create an abstract class named Shape with abstract methods calculatePerimeter()
 * for calculating the perimeter and calculateArea() for calculating the area.
 * Create classes Rectangle, Triangle, Hexagon extending the Shape class,
 * and implement the abstract methods accordingly. Verify the correctness of the program.
 */
public class Rectangle extends Shape {

    private final int rectangleSide1;

    private final int number2;

    public Rectangle(int rectangleSide1, int number2) {
        this.rectangleSide1 = rectangleSide1;
        this.number2 = number2;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (rectangleSide1 + number2);
    }

    @Override
    public double calculateArea() {
        return rectangleSide1 * number2;
    }
}
