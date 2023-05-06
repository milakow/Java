package org.advancedPart.anonymousClasses.lambdaExpression;

import java.util.Locale;

/**
 *  Create a Printer interface with one method, print, which takes a String argument,
 *  use this interface to implement a lambda function:
 * - a screaming function that displays text in uppercase and adds an exclamation mark,
 * -  (difficult) a function that displays a string created from the first letter of each word.
 */
public class PrinterDemo {
    public static void main(String[] args) {
        Printer screamer = text -> text.toUpperCase() + "!";
        System.out.println("Screaming function result: " + screamer.print("eukaliptus"));


        Printer wordCreator = text -> {
            String newWord = "";
            String[] words = text.split(" ");
            for ( String word : words) {
                newWord += word.charAt(0);
            }
            return newWord;
        };
        System.out.println("Function creating word from the first letter of each word result: " + wordCreator.print("Siala babka mak nie wiedziala jak"));
    }
}

interface Printer{
    String print(String arg);
}
//class Word{
//
//
//    public static void main(String[] args) {
//        String newWord = "";
//        String text = "Siala babka mak nie wiedziala jak";
//        String[] words = text.split(" ");
//        for ( String word : words) {
//            newWord += word.charAt(0);
//        }
//        System.out.println(newWord);
//    }
//
//}
