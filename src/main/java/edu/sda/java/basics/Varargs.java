package edu.sda.java.basics;

public class Varargs {
    class Pair{
        int left;
        String right;
    }

    public static void main(String[] args) {
        varArgsOne(1);
        System.out.println("=============");
        varArgsOne(5, 6, 7);
        System.out.println("=============");
        varArgsOne(1,2,3,4,5,6);
        System.out.println("=============");
        varArgsOne();
        System.out.println("=============");
        varArgsTwo("Grzesiek", 45, 1,2,3);
        System.out.println("=============");
        varArgsTask(2, 1,4,8,2,3);
    }
    int calculateSth(Pair ... pairs) {
        int result = 0;
        for (Pair pair : pairs) {
            result += pair.left;
            System.out.println(pair.right);
        }
        return result;
    }
    /**
     * we can call method with no args or with many args
     */

    private static void varArgsOne(int ... params) {
        for (int i = 0; i < params.length; i++) {
            System.out.println("Param number " + i + " is: " + params[i]);
        }
    }
    /**
     * In this case we need to define "name" and "age" params
     * and we can put multiply "classes" params - between 0 and "many"
     */

    private static void varArgsTwo(String name, int age, int ... classes) {
        System.out.println(name);
        System.out.println(age);
        System.out.println("Classes: ");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }
    /**
     * Write a program that accepts int and a random number of ints - var
     * check if in this var there's a number passed in first argument
     * if there's match, print "Found", otherwise print "Unfortunately, no match"
     */
    private static void varArgsTask(int number, int ... numOfInts) {
        for (int i = 0; i < numOfInts.length; i++) {
            if (number == numOfInts[i]) {
                System.out.println("Found: " + number + " in position " + i);
                break;
            } else {
                System.out.println("Unfortunately, no match for: " + i);
            }
        }
    }

}
