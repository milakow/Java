package edu.sda.java.basics.practise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Write an application that will take a positive number from the user (type int)
 * and calculate the Fibonacci number at the indicated index.
 * For example, if the number equals 5, your program should print the fifth Fibonacci number.
 * In Fibonacci sequence, each number is the sum of the two preceding ones.
 * For example, the first few Fibonacci numbers are:
 *
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Your number should be bigger than O.");
        }
        int firstNum = 0;
        int nextNum = 1;

        int sum = 0;
        for (int i = 2; i < number+1; i++) {
            sum = firstNum + nextNum;
            firstNum = nextNum;
            nextNum = sum;
//            System.out.println("sum: " + sum);
        }
        System.out.println("The " + number + " number of Fibonacci sequence is: " + sum);
    }
}
