package org.advancedPart.Tasks.Line;

public class LineFactoryDemo {
    public static void main(String[] args) {
//        char letter = 'a';
//        letter++;
//        System.out.println(letter);


        LineFactory factory = new LineFactory();
        Line line = factory.withRandomLength("*");
        System.out.println("Line with random length:");
        line.printLine();

        System.out.println("\n Line with random filling:");
        System.out.println();
        factory.withRandomFilling(8).printLine();

        System.out.println("\n Line with random filling and length:");
        Line line2 = factory.withRandomFillingAndRandomLength();
        line2.printLine();

        System.out.println();
        System.out.println();
        System.out.println();

        Line[] createdLines = factory.createManyRandomLines(20);
        for (Line createdLine : createdLines) {
            createdLine.printLine();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        factory.createLineWithGrowingLength().printLine();
        factory.createLineWithGrowingLength().printLine();
        factory.createLineWithGrowingLength().printLine();
    }
}
