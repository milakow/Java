package advancedDevelopment.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Task 1:
 * Create a method that takes a list of strings as a parameter, and then returns that list sorted alphabetically from Z to A.
 */
public class Sorter {
    public static void main(String[] args) {
        //1
//        ArrayList<String> sortedList = new ArrayList();
//        sortedList.add("house");
//        sortedList.add("car");
//        sortedList.add("tree");
//        sortedList.add("garage");
//
//        System.out.println("unsorted ArrayList " + sortedList);
//        Collections.sort(sortedList, Collections.reverseOrder());
//        System.out.println("sorted ArrayList in reverse order: " + sortedList);

        //2
//        ArrayList<String> sortedStringList = stringList -> {
//            return Collections.sort(stringList, Collections.reverseOrder());
//        };
//        }


    }
    // List: c, b, a
    public static List<String> sortDescending(List<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) { // i = 1
            for (int j = i + 1; j < strings.size(); j++) { // j = 2
                if (strings.get(i).compareTo(strings.get(j)) < 0) {
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

interface SortingInterface{
    void sort(String names);
}


