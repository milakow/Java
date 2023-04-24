package edu.sda.java.testing.bmi;

//import java.util.Scanner;

public class BMICounter {

    public static double BMICalculator(double height, float weight) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height / weight cannot be negative numbers!");
        } else {
            return weight / (height * height);
        }
//        return weight / (height * height);
//        return Math.round(bmi*100.0)/100.0;
//        return bmiR;
    }
}

