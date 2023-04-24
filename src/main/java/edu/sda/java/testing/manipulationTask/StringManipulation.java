package edu.sda.java.testing.manipulationTask;

public class StringManipulation {
    public static String reverseString(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }

        return reversedString;
    }

    public static boolean isPalindrome(String s) {
        boolean result = false;
        String reversedString = reverseString(s);
        if (s.equals(reversedString)) {
            result = true;
        }
        return result;
    }
}
