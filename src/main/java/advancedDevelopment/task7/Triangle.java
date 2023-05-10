package advancedDevelopment.task7;

/**
 * Create an abstract class named Shape with abstract methods calculatePerimeter()
 * for calculating the perimeter and calculateArea() for calculating the area.
 * Create classes Rectangle, Triangle, Hexagon extending the Shape class,
 * and implement the abstract methods accordingly. Verify the correctness of the program.
 */
public class Triangle extends Shape{
    private final int triangleSide1;
    private final int triangleSide2;
    private final int baseTrangleAtHeight;

    private final int triangleHeight;

    public Triangle(int triangleSide1, int triangleSide2, int baseTrangleAtHeight, int triangleHeight) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.baseTrangleAtHeight = baseTrangleAtHeight;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public int calculatePerimeter() {
        return triangleSide1 + triangleSide2 + baseTrangleAtHeight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * triangleHeight * baseTrangleAtHeight;
    }
}
