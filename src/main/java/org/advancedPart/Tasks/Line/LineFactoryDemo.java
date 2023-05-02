package org.advancedPart.Tasks.Line;

public class LineFactoryDemo {
    public static void main(String[] args) {
//        char letter = 'a';
//        letter++;
//        System.out.println(letter);



        LineFactory factory = new LineFactory();
        Line line = factory.withRandomLength("*");
        line.printLine();

        factory.withRandomFilling(8).printLine();
        Line line2 = factory.withRandomFillingAndRandomLength();
        line2.printLine();

        System.out.println();
        System.out.println();
        System.out.println();

        Line[] createdLines = factory.createManyRandomLines(100);
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
