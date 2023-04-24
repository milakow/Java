package edu.sda.java.basics.practise;

import java.util.Scanner;

/**
 * Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each word is printed twice.
 * For example, for the input: "This is my test" the application should print "This This is is my my test test".
 */

public class Stuttering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word + " " + word + " ");
        }
    }
}
