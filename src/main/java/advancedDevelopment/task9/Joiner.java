package advancedDevelopment.task9;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a Joiner class that takes a separator (string) in the constructor
 * and has a join() method that allows any number of objects of type T to be passed as arguments.
 * This method will return a string by joining all the passed elements by calling their toString() method and separating them with the separator.
 * For example, for Integers and a separator of "-", it should return: "1-2-3-4...".
 */

public abstract class Joiner<T> {

    private List<T> joiner = new ArrayList<>();
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public abstract String join(T... params);

//    public String join(T... params) {
//        String result = params[0].toString();
//        for (int i = 1; i < params.length; i++) {
//            result += separator + params[i].toString();
//
//        }
//        return result;
//    }

    public String getSeparator() {
        return separator;
    }
}

