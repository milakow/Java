package advancedDevelopment.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Task 1:
 * Create a method that takes a list of strings as a parameter, and then returns that list sorted alphabetically from Z to A.
 */
public class Sorter {
    public static void main(String[] args) {
        //1
        ArrayList<String> sortedList = new ArrayList();
        sortedList.add("house");
        sortedList.add("car");
        sortedList.add("tree");
        sortedList.add("garage");

        System.out.println("unsorted ArrayList " + sortedList);
        Collections.sort(sortedList, Collections.reverseOrder());
        System.out.println("sorted ArrayList in reverse order: " + sortedList);

        //2
//        ArrayList<String> sortedStringList = stringList -> {
//            return Collections.sort(stringList, Collections.reverseOrder());
//        };
//        }


    }
}



