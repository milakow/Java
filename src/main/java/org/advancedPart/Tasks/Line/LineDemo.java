package org.advancedPart.Tasks.Line;

public class LineDemo {
    public static void main(String[] args) {
        Line line1 = new Line(6, "-");
        Line line2 = new Line(9, "*");
        Line line3 = new Line(15, "_");

        line1.printLine();
        System.out.println("\n");
        line2.printLine();
        System.out.println("\n");
        line3.printLine();
        System.out.println("\n");

        //task3
        System.out.println("Task 3: ");
        Line lineWithLength = new Line(4);
        Line lineWithFilling = new Line("o");
        System.out.println(lineWithLength);
        System.out.println(lineWithFilling);

        //task4
        System.out.println("Task 4: ");
        System.out.println(line2);

        //task5
        System.out.println("Task 5: ");
        System.out.println(line3.getFilling());


        LineFactory l1 = new LineFactory();

//        System.out.println("Task1: ");
//        l1.buildLine1();
//        System.out.println("Task2: ");
//        l1.buildLine2();
//        System.out.println("Task3: ");
//        l1.buildLine3();



    }
}
