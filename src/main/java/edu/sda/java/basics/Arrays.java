package edu.sda.java.basics;

public class Arrays {
    public static void main(String[] args) {

        String[] stringTable1 = new String[3];
        stringTable1[0] = "Pies";
        stringTable1[1] = "Kot";
        stringTable1[2] = "Ryba";
//        stringTable1[3] = "Papuga"; -- ends with IndexOutOfBoundsException

        String[] anotherTable = new String[]{"Krowa", "Kon", "Swinka", "Kura", "Indyk"};

        System.out.println(anotherTable[3]);
        System.out.println("===================");

        for (String s : anotherTable) {
            System.out.println(s);
        }
        System.out.println("===================");

        for (int i = 0; i < anotherTable.length; i++) {
            System.out.println("index : " + i + " " + anotherTable[i]);
        }
        System.out.println("===================");

        boolean[] boolTable = new boolean[4];
        boolTable[0] = true;
        boolTable[3] = true;

        System.out.println("Bool table");
        for (int i = 0; i < boolTable.length; i++) {
            System.out.println("i= " + i + " " + boolTable[i]);
        }
        System.out.println("===================");

        String[][] multiDimensional = new String[2][3];
        multiDimensional[0][0] = "Ala";
        multiDimensional[0][1] = "Zosia";
        multiDimensional[0][2] = "Basia";

        multiDimensional[1][0] = "Jas";
        multiDimensional[1][1] = "Stas";
        multiDimensional[1][2] = "Krzys";

        for (int i = 0; i < multiDimensional.length; i++) {
            for(int j = 0; j < multiDimensional[i].length; j++) {
                System.out.print(multiDimensional[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
