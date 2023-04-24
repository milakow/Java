package edu.sda.java.basics.practise;

import java.util.Scanner;

/**
 * Write an application that implements a simple calculator. The application should:
 *  a. read first number (type float)
 *  b. read one of following symbols: + - / *
 *  c. read second number (type float)
 *  d. return a result of given mathematical operation
 * If the user provides a symbol other than supported, the application should print "Invalid symbol".
 * If the entered action cannot be implemented (i.e. it is inconsistent with the principles of mathematics),
 * the application should print "Cannot calculate".
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float firstNum = input.nextFloat();   //double ze scannera

//        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter operator (+ - / *): ");
        char operator = input.next().charAt(0);

        System.out.println("Enter second number: ");
        float secondNum = input.nextFloat();  //double ze scannera

//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            System.out.println("Invalid symbol");
//        }
        switch (operator){
            case '+':
                System.out.println("Result: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result: " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result: " + (firstNum * secondNum));
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Cannot calculate");
                } else {
                    System.out.println("Result: " + (firstNum / secondNum));
                    break;
                }
            default:
                System.out.println("Invalid symbol");

        }
    }
}
