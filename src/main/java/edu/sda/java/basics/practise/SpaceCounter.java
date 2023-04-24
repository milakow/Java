package edu.sda.java.basics.practise;

import java.util.Scanner;

/**
 * Write an application that reads a text from the user (type String)
 * and counts a percentage of occurrences of a space character.
 */

public class SpaceCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = input.nextLine();
        String[] signs = text.split("");
        int signsLength = signs.length;
        System.out.println("length of signs: " + signsLength);
        int spaceCounter = 0;
        for (String sign : signs) {
            if (sign.equals(" ")) {
                spaceCounter += 1;
            }
        }
        System.out.println("Amount of spaces: " + spaceCounter);
//        float percetageOfSpaceOccur = 0;
        double percentageOfSpaceOccur = (double) spaceCounter / signsLength * 100;
        System.out.println(Math.round(percentageOfSpaceOccur) + "%");
    }
}
