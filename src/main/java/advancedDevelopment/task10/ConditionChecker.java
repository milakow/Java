package advancedDevelopment.task10;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Implement a generic method called partOf that takes an array of any type
 * and a function as parameters and returns the percentage of elements that satisfy the condition.
 */

public class ConditionChecker {

    public static void main(String[] args) {
        ConditionChecker conditionChecker = new ConditionChecker();
        System.out.println(conditionChecker.partOf(new Integer[] {1,2,3,4}, a -> a % 2 == 0));
    }
    public <T> long partOf(T[] items, Predicate<T> func) {
        long num = Arrays.stream(items)
                .filter(func)
                .count();
        return (num * 100) / items.length;


    }
}
