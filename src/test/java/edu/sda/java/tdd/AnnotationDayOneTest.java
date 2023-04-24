package edu.sda.java.tdd;
import org.junit.jupiter.api.*;


public class AnnotationDayOneTest {
    @BeforeEach
    void testingBeforeEach() {
        System.out.println("Before each test this line will be displayed");
    }

    @BeforeAll
    public static void testingBeforeAll() {
        System.out.println("Before all tests this line will be displayed");
    }

    @Test
    @DisplayName("Test 1")
    void testingTask() {
        System.out.println("test no 1");
    }

    @Test
    @DisplayName("Test 2")
    void testingTask2() {
        System.out.println("test no 2");
    }

    @Test
    @Disabled
    void testingTask3() {
        System.out.println("Test 3");
    }

    @AfterEach
    void testingAfterEach() {
        System.out.println("After each test this line will be displayed");
    }

    @AfterAll
    public static void  testingAfterAll() {
        System.out.println("After all tests this line will be displayed");
    }

}
