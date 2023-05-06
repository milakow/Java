package org.advancedPart.streams;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 36. Using ready-made functional interface classes (Function, Consumer, Supplier, Comparator, Predicate) implement and test 5 functions:
 * - a function that accepts a text and returns its length,
 * - a function that checks whether the submitted text has at least 5 characters,
 * - a function that supplies a random double between 0.1-0.5,
 * - a function to print text in capital letters.
 */
public class FunctionalInterfaceClassesDemo {
    public static void main(String[] args) {
        // * - a function that accepts a text and returns its length,
        String text = "Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz";

        Function<String, Integer> giveTextLength = textLength -> text.split("").length;
        System.out.println(giveTextLength.apply(text));

        // * - a function that checks whether the submitted text has at least 5 characters,
        Predicate<String> checkTextLength = True -> text.length() >= 5;
        System.out.println(checkTextLength.test(text));

        // * - a function that supplies a random double between 0.1-0.5,
        Supplier<Double> randomDouble = () -> {
            Random random = new Random();
            return random.nextDouble(0.1, 0.5);
//            return (ThreadLocalRandom.current().nextDouble() * 0.4) + 0.1;
        };
        System.out.println(randomDouble.get());
        System.out.println(randomDouble.get());
        System.out.println(randomDouble.get());

        // * - a function to print text in capital letters.
        Consumer<String> capitalLettersPrinter = str -> System.out.println(str.toUpperCase());
        capitalLettersPrinter.accept(text);






    }
}
