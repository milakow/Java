package edu.sda.java.tdd;

import edu.sda.java.testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdding(){
        Calculator calculator = new Calculator();

        int result = calculator.add(4, 1);

        Assertions.assertEquals(5, result);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testAdd(int num1, int num2, int expected) {
        assertEquals(expected, calculator.add(num1, num2));
    }
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(-1, 8, 7)
        );
    }
    @DisplayName("Test and method with many params")
    @ParameterizedTest(name = "{index} -> num1={0}, num2={1}, expected={1}")
    @CsvSource({
            "2, 3, 5",
            "-1, 8, 7"
    })

    void testParamAdd(int num1, int num2, int expected) {
        assertThat(calculator.add(num1, num2)).isEqualTo(expected);
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
