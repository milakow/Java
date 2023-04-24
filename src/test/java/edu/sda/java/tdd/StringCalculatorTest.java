package edu.sda.java.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  TDD- test driven development
 *  3 stages: RED, GREEN, REFACTOR
 *
 *  1. First most generic, not working code
 *  2. Write test to check scenario
 *  3. As scenario fails, fix the code
 *  4. Refactor code
 *  5. To add new feature, go to 2
 */

class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeAll
    public static void mainSetUp() {
        /**
         * method to run once for all tests before them
         * I.E. preparing entry data set
         */
    }

    @BeforeEach // indicates that method should be run before each of tests in the class
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test
    public void checkIfZeroWhenEmptyStringPassed() {
        //given --data / state of app
        String entry = "";

        //when -- launching some process / method
        int result = calculator.sum(entry);

        //then --result is compared to expected
        assertEquals(0, result, "Result not equal to zero");
    }

    @Test
    public void checkIfCalcReturnsOneNumberPassed() {
        //given
        String entry = "5";

        //when
        int result = calculator.sum(entry);

        //then
        assertEquals(5, result,"Invalid value");
    }

    @Test
    public void checkIfCalcCountsWithNumbersSeparatedByComma() {
        //given
        String entry = "8,4";

        //when
        var result = calculator.sum2(entry);

        //then
        assertEquals(12, result, "Impossible to calculate");
    }

    @Test
    public void checkIfCalcCountsUnknownAmountOfNumbersSeparatedByComma() { //task 2 "method to handle an unknown amount of numbers"
        //given
        String entry = "1,2,3,4";

        //when
        var result = calculator.sum2(entry);

        //then
        assertEquals(10, result, "Impossible to calculate");
    }

    @Test
    public void checkIfCalcCountsUnknownAmountOfNumbersSeparatedByNewLines() { //task 3 "method to handle new lines between numbers (instead of commas)"
        //given
        String entry = "1\n2,3";

        //when
        var result = calculator.sum3(entry);

        //then
        assertEquals(6, result, "Impossible to calculate");
    }


//    @Test
//    public void checkIfCalcCountsUnknownAmountOfNumbersSeparatedByDifferentDelimiters() {     // task 4 Support different delimiters:
//                                                                                            //to change a delimiter, the beginning of the string will contain a separate line
//        //given
//        String entry = "//;\\n1;2";
//
//        //when
//        var result = calculator.sum4(entry);
//
//        //then
//        assertEquals(3, result, "Impossible to calculate");
//    }

    @Test
    public void checkIfCalcCountsUnknownNegativeNumbers() {     // task 5 Calling Add with a negative number will throw an exception “negatives not allowed” -
        //given                                                                                 //and the negative that was passed.
        String entry = "-3,2,1";

        //when
        var result = calculator.sum5(entry);

        //then
        assertEquals("negatives not allowed", result, "Impossible to calculate");
    }


    @AfterEach //run AFER each of the tests
    public void destroy() {
        calculator.hashCode(); // may be useful to return to previous app state
    }

    @AfterAll
    public static void finalCleanup() {
        /**
         * run once after all tests
         */
    }
}