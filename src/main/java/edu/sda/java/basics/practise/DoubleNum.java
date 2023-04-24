package edu.sda.java.basics.practise;

import java.util.Scanner;

/**Write an application that reads from the user 10 arbitrarily large numbers (variables of type int)
 * and prints those that occurred at least twice.
 */
public class DoubleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 arbitrarily large numbers!!! ");

        for (int i = 1; i < 11; i++) {
            System.out.println("Enter " + i + " number: ");
            int num_i = input.nextInt();
        }
        System.out.println("");
//        int num = input.nextInt();

    }
}
