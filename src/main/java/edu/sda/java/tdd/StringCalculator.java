package edu.sda.java.tdd;

public class StringCalculator {
    public int sum(String argument) {
        if (argument.equals("")) {
            return 0;
        }
        return Integer.parseInt(argument);
    }

    public int sum2(String argument) {
        String[] numbers = new String[argument.length()];
        int result = 0;
        if (argument.contains(",")) {
            numbers = argument.split(",");
            for (String number : numbers) {
                result += Integer.parseInt(number);
            }
        }
        return result;
    }

    public int sum3(String argument) {
        String[] numbers = new String[argument.length()];
        int result = 0;
        if (argument.contains(",") || argument.contains("\n")) {
//            numbers = new String[]{argument.replace('\n', ' ')};
            numbers = argument.split("[\n ,]+");
//            numbers = argument.split(",");
            for (String number : numbers) {
                result += Integer.parseInt(number);
            }
        }
        return result;
    }


//    public int sum4(String argument) {
//        String[] numbers = new String[argument.length()];
//        int result = 0;
//        char[] chars = argument.toCharArray();
//
//        for (char c : chars) {
//            if(!Character.isLetter())
//        }
//        if (argument.contains(",") || argument.contains("\n") || argument.contains(";") || argument.contains("/") || argument.contains("!") ) {
////            numbers = new String[]{argument.replace('\n', ' ')};
//            numbers = argument.split("[\n ,/;!]+");
////            numbers = argument.split(",");
//            for (String number : numbers) {
//                result += Integer.parseInt(number);
//            }
//        }
//        return result;
//    }

    public int sum5(String argument) {
        String[] numbers = new String[argument.length()];
        int result = 0;
        try {
            for (String number : numbers) {
                if (Integer.parseInt(number) < 0) {
//                   throw new Exception("negatives not allowed" + number);
                   throw new Exception("negatives not allowed" + number);
                } else {
                    result += Integer.parseInt(number);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}


//    public int Add(String numbers) {
//
//    }
//}

//else {
//            result = Integer.parseInt(argument);
//        }
