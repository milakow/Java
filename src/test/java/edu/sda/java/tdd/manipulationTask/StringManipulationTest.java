package edu.sda.java.tdd.manipulationTask;

import edu.sda.java.testing.manipulationTask.StringManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringManipulationTest {
    @Test
    void testReverseString() {
        String result = StringManipulation.reverseString("qwerty");
        Assertions.assertEquals("ytrewq", result);
    }

    @Test
    void testReverseStringWithEmptyString() {
        String result = StringManipulation.reverseString("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testIfStringIsPalindrome(){
        boolean result = StringManipulation.isPalindrome("zakaz");
        Assertions.assertTrue(result);
    }

    @Test
    void testIfStringIsPalindrome2(){
        boolean result = StringManipulation.isPalindrome("house");
        Assertions.assertFalse(result);
    }
}