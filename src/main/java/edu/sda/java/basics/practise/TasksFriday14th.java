package edu.sda.java.basics.practise;

public class TasksFriday14th {
    public static void main(String[] args) {
//    stars();
//    calculateAdd();
//    division();
    printingSigns();
    }

    private static void stars(){
        /**
         * write a method that prints stars * in lines iterating, between 1 and 30 stars
         * but avoid printing line if there should be 10 or 20 stars
         */
    String star = "";
    for (int i = 1; i < 30; i++) {
        star += "*";
        if (i == 10 || i == 20) {
            continue;
        }
        System.out.println(star);

        }
    }


    private static void calculateAdd() {
        /**
         * Write a method to add two values defined in
         * that method
         * Print the result
         * If result is over 50, add a line printing "Big number"
         */
        System.out.println("\n ======================= \n");
        int firstVal = 40;
        int secondVal = 5;
        int result = firstVal + secondVal;
        System.out.println(result);
        if (result > 50) {
            System.out.println("Big number");
        }
    }

    private static void division() {
        /**
         * Write a method to divide two numbers
         * If second number is 0, write a comment and do not do division
         * Otherwise divide and print base numbers and result
         */
        System.out.println("\n ======================= \n");
        int firstNumber = 15;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        if (secondNumber == 0){
            System.out.println("Do not divide by 0!!!");
        } else {
            System.out.println("The base numbers: " + firstNumber  + " and " + secondNumber);
            System.out.println("The result: " + result);
        }
    }

    private static void printingSigns() {
        /**
         * Create a program that will work in a loop from 1 to 50
         * print a stars (as above)
         * if iteration is even, in the end of the line, print ++
         * if iteration is possible to divide by 7, print on end of line 7
         * if rest from division by 4 is 3, add %3 to end of line printed
         *
         */
        System.out.println("\n ======================= \n");
        String star = "";

        for (int i = 1; i < 50; i++) {
            star += "*";
            System.out.print(i + " " + star);
            if (i % 2 == 0) {
                System.out.print(" ++");
            }
            if (i % 7 == 0) {
                System.out.print(" 7");
            }
            if (i % 4 == 3) {
                System.out.print(" %3");
            }
            System.out.println("\n");
        }

    }

    }