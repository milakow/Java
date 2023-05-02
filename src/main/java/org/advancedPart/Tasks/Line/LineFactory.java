package org.advancedPart.Tasks.Line;

//Task 6

import java.util.Random;

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
//    String filler;
//    int length;
//    Random rand = new Random();
    private final Random random = new Random();
    private int length = 2;


    //Line object of random length with a selected character
    //my solution: METHOD SHOULD RETURN SMTH, NOT PRINT
//    void buildLine1(String filling) {
//        filler = ":";
//        for (int i = 0; i< rand.nextInt(1, 50); i++) {
//            System.out.print(filling);
//        }
//    }

    //solution from class:
    public Line withRandomLength(String filling) {
        return new Line(getRandomLength(), filling);
    }


    // * - a line of the selected length but with a random character,
    //my solution
//    void buildLine2() {
//        length = 30;
//        System.out.println(RandomStringUtils.randomAscii(length));
//    }
    //solution from class:
    public Line withRandomFilling(int length) {
        return new Line(length, getRandomFilling());
    }


    //a line with random length and random character
    //my solution:
//    void buildLine3() {
//        int bound =100;
//        System.out.println(RandomStringUtils.randomAscii(rand.nextInt(bound)));
//    }

    //solution from class:
    public Line withRandomFillingAndRandomLength() {
        return new Line(random.nextInt(1, 20), getRandomFilling());
    }

//specified number of lines (using method parameter)
// with random length and character (use previous method)
   public Line[] createManyRandomLines(int lineCount) {
        Line[] lines = new Line[lineCount];
        for (int i = 0; i < lineCount; i++) {
            lines[i] = withRandomFillingAndRandomLength();
        }
        return lines;
   }
 //a line with length of two and a random character
 // but each subsequent line returned is supposed to be
 // 2x longer than the previous one
   public Line createLineWithGrowingLength() {
        Line line = new Line(length, getRandomFilling());
        length *= 2;
        return line;
   }

   private int getRandomLength() {
       return random.nextInt(1, 20);
   }

    private String getRandomFilling() {
        char randomFilling =(char) random.nextInt(50,100);
        return randomFilling + "";
    }

}
