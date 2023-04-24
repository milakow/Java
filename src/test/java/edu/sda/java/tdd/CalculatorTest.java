package edu.sda.java.tdd;

import edu.sda.java.testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdding(){
        Calculator calculator = new Calculator();

        int result = calculator.add(4, 1);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();

        int result = calculator.subtract(4, 1);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();

        int result = calculator.multiply(4, 2);

        Assertions.assertEquals(8, result);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();

        double result = calculator.divide(6, 2);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Exception for dividing by zero")
    public void shouldThrowExceptionIfDivideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }

//    @Test
//    public void testDivisionByZero() {
//        Calculator calculator = new Calculator();
//        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
//        Assertions.assertEquals("Cannot divide by zero!", exception.getMessage());
//    }
}
