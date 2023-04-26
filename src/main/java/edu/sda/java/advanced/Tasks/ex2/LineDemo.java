package edu.sda.java.advanced.Tasks.ex2;

public class LineDemo {
    public static void main(String[] args) {
        Line line1 = new Line(6, "-");
        Line line2 = new Line(9, "*");
        Line line3 = new Line(15, "_");

//        line1.printLines();
//        System.out.println("\n");
//        line2.printLines();
//        System.out.println("\n");
//        line3.printLines();
//        System.out.println("\n");

        LineFactory l1 = new LineFactory();

//        System.out.println("Task1: ");
//        l1.buildLine1();
//        System.out.println("Task2: ");
//        l1.buildLine2();
        System.out.println("Task3: ");
        l1.buildLine3();



    }
}
