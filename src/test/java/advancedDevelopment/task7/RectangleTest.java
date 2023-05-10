package advancedDevelopment.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
    public void checkRectanglePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(2,6);

        //when
        int result = rectangle.calculatePerimeter();

        //then
        assertEquals(result, 16);
    }

    @Test
    public void checkRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(2,6);

        //when
        double result = rectangle.calculateArea();

        //then
        assertEquals(result, 12.0);
    }



}