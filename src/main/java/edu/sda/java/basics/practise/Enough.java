package edu.sda.java.basics.practise;

import java.util.Scanner;

/**
 * Write an application that will read texts (variables of the String type) until the user gives the text "Enough!"
 * and then writes the longest of the given texts (not including the text "Enough!").
 * If the user does not provide any text, write "No text provided".
 */
public class Enough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestWord = "";
        String text;

        while (true) {
            System.out.print("Enter a text (type 'Enough!' to finish): ");
            text = scanner.nextLine();

            if (text.equals("Enough!")) {
                break;
            }

            String[] words = text.split(" ");

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        if (longestWord.isEmpty()) {
            System.out.println("No text provided.");
        } else {
            System.out.println("Longest word: " + longestWord);
        }
    }
}

