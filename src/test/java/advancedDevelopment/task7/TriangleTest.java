package advancedDevelopment.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void checkTrianglePerimeter() {
        //given
        Triangle triangle = new Triangle(2,3, 4, 3);
        //when
        int result = triangle.calculatePerimeter();

        //then
        assertEquals(result, 9);
    }

    @Test
    public void checkTriangleArea() {
        //given
        Triangle triangle = new Triangle(2,3, 4, 3);

        //when
        double result = triangle.calculateArea();

        //then
        assertEquals(result, 6);
    }

}