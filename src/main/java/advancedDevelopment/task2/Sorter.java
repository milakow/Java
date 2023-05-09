package advancedDevelopment.task2;

import java.util.List;
/**
 * Create a method that takes a list of strings as a parameter,
 * and then returns that list sorted alphabetically from Z to A without considering letter case.
 */
public class Sorter {
    public static void main(String[] args) {

    }

    public static List<String> sortDescendingWithoutLetterCase(List<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) { // i = 1
            for (int j = i + 1; j < strings.size(); j++) { // j = 2
                if (strings.get(i).compareToIgnoreCase(strings.get(j)) < 0) {
                    // swap the elements at indices i and j
                    String temp = strings.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, temp);
                }
            }
        }

        return strings;
    }
}
