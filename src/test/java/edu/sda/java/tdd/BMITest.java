package edu.sda.java.tdd;

import edu.sda.java.testing.bmi.BMICounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BMITest {
    @Test
    public void testFormula() {
//        BMICounter calculator = new BMICounter();
        double result = BMICounter.BMICalculator(1.50, 50);
        Assertions.assertEquals(22.22, result, 0.01);
    }

    @Test
    public void testFormulaWithNegativeParameters() {
//        BMICounter calculator = new BMICounter();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> BMICounter.BMICalculator(0, 50));
        Assertions.assertEquals("Height / weight cannot be negative numbers!", exception.getMessage());
    }
}
