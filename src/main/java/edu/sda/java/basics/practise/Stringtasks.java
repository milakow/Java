package edu.sda.java.basics.practise;

import java.util.Scanner;
import java.util.regex.*;

public class Stringtasks {
    public static void main(String[] args) {
//        reader1();
//        reader2();
//        reader3();
//        task4();
    }

    private static void reader1() {
        /**
         * Read two texts from input and print it as one
         */
        System.out.println("Enter first text:  ");
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();

        System.out.println("Enter second text:  ");
        String text2 = scanner1.nextLine();

        String finalText = text1.concat(text2);
        System.out.println("You entered: " + finalText);

    }

    private static void reader2() {
        /**
         * Read two numbers and print them.
         * Then print sum, substraction, multiplication and division of these two.
         * Assume these numbers will be integers
         */
        System.out.println("Enter first bigger number:  ");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();

        System.out.println("Enter second smaller number:  ");
        int num2 = scanner1.nextInt();

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("The sum of given number equals: " + sum);
        System.out.println("The substraction of given number equals: " + subtraction);
        System.out.println("The multiplication of given number equals: " + multiplication);
        System.out.println("The division of given number equals: " + division);
    }

    private static void reader3() {
        /**
         * Write a program to check if given person
         * can enter the gocart
         * Read height(cm) and weight(kg)
         * If person is smaller then 150
         * and weights more then 180
         * write "Fasten your seatbelds, Wear a helmet!"
         * Otherwise write "Sorry, we cannot let you in"
         */
        System.out.println("Enter your height in cm:  ");
        Scanner scanner1 = new Scanner(System.in);
        int height = scanner1.nextInt();

        System.out.println("Enter your weight in kg:  ");
        Scanner scanner2 = new Scanner(System.in);
        int weight = scanner2.nextInt();

        if (height < 150 || weight > 180) {
            System.out.println("Sorry, we cannot let you in. :( ");
        } else {
            System.out.println("Fasten your seatbelds, Wear a helmet!");
        }

    }

    private static void task4() {
        /**
         * Write a program that reads a line from input
         * Then print only these words from it that start with capital letter
         */
        System.out.println("Enter line of words:  ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        String regEx = "[A-Z][a-z]+";
        for (String word : words) {
//            System.out.println(word);
            if (word.matches(regEx)) {
                System.out.println(word);
            }
        }
    }
}
