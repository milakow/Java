package advancedDevelopment.task7;

/**
 * Create an abstract class named Shape with abstract methods calculatePerimeter()
 * for calculating the perimeter and calculateArea() for calculating the area.
 * Create classes Rectangle, Triangle, Hexagon extending the Shape class,
 * and implement the abstract methods accordingly. Verify the correctness of the program.
 */
public class Hexagon extends Shape{
    private final int hexagonSide1;


    public Hexagon(int hexagonSide1) {
        this.hexagonSide1 = hexagonSide1;
    }

    @Override
    public int calculatePerimeter() {
        return 6 * hexagonSide1;
    }

    @Override
    public double calculateArea() {
        return 3 * Math.sqrt(3) * Math.pow(hexagonSide1, 2.0) / 2;
    }
}
