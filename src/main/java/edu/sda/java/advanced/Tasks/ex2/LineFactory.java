package edu.sda.java.advanced.Tasks.ex2;

//Task 6

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


/**
 * In the program with Lines, create an additional class: LineFactory, and in it create methods that produce and return:
 * - a Line object of random length with a selected character,
 * - a line of the selected length but with a random character,
 * - a line with random length and random character,
 * - specified number of lines (using method parameter) with random length and character (use previous method),
 * - a line with length of two and a random character but each subsequent line returned is supposed to be 2x longer than the previous one.
 * Then, in the LineDemo class, test all the methods by printing the lines produced by them.
 */
public class LineFactory {
    String filler;
    int length;
    Random rand = new Random();
    void buildLine1() {
        filler = ":";
        for (int i = 0; i< rand.nextInt(50); i++) {
            System.out.print(filler);
        }
    }

    void buildLine2() {
        length = 30;
        System.out.println(RandomStringUtils.randomAscii(length));
    }

    void buildLine3() {
        int bound =100;
        System.out.println(RandomStringUtils.randomAscii(rand.nextInt(bound)));
    }

    void buildLine4() {

    }

}
