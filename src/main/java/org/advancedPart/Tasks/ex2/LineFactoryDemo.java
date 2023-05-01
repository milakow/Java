package org.advancedPart.Tasks.ex2;

public class LineFactoryDemo {
    public static void main(String[] args) {
//        char letter = 'a';
//        letter++;
//        System.out.println(letter);



        LineFactory factory = new LineFactory();
        Line line = factory.withRandomLength("*");
        line.print();

        factory.withRandomFilling(8).print();
        Line line2 = factory.withRandomFillingAndRandomLength();
        line2.print();

        System.out.println();
        System.out.println();
        System.out.println();

        Line[] createdLines = factory.createManyRandomLines(100);
        for (Line createdLine : createdLines) {
            createdLine.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        factory.createLineWithGrowingLength().print();
        factory.createLineWithGrowingLength().print();
        factory.createLineWithGrowingLength().print();
    }
}
