package edu.sda.java.testing.bmi;

import java.util.Scanner;

public class BMICounterMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in m: ");
        double height = input.nextFloat();

        System.out.println("Enter your weight in kg: ");
        float weight = input.nextFloat();

//        BMICounter bmiResult = new BMICounter();
        System.out.println(BMICounter.BMICalculator(height, weight));
    }
}
