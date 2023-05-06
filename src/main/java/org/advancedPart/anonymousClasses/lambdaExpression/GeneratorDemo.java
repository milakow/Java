package org.advancedPart.anonymousClasses.lambdaExpression;

import java.util.Random;

/**
 * Create Generator interface with one method generate that returns int.
 * implement it using lambda expression to return random value of range 1-10
 */
public class GeneratorDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Generator generator = () -> random.nextInt(1, 11);

        System.out.println(generator.generate());
    }
}

interface Generator{
    int generate();
}
