package advancedDevelopment.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
 * Create a class called Storage that has a private field of type Map, a public constructor, and the following methods:
 *
 * addToStorage(String key, String value): adds elements to the storage.
 * printValues(String key): displays all elements under a given key.
 * findValues(String value): displays all keys that have the given value.
 *
 * The Storage class should allow for storing multiple values under one key.
 */
public class Storage {
    public static void main(String[] args) {

    }
    private Map<String, List<String>> storage = new HashMap<>();


    public Storage() {
        this.storage = new HashMap<>();
    }


// * addToStorage(String key, String value): adds elements to the storage.
    public void addToStorage(String key, String value){
        List<String> values = storage.get(key);
        if (values == null) {
            values = new ArrayList<>();
        } else {
            values.add(value);
            storage.put(key, values);
        }

    }


    // * printValues(String key): displays all elements under a given key.
    public void printValues(String key){
        List<String> values = storage.get(key);
            if (values == null) {
                System.out.println("No values for this key");
            } else {
                values.forEach(System.out::println);
            }
    }

    // * findValues(String value): displays all keys that have the given value.
    public void findValues(String value){
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
//        for (String values : List<String> val)
//            for(String value : map.values()) {
//                if (map.containsValue(value)) {
//                    map.forEach((key, value) -> System.out.println(key + " : " + value));            }
//            }

    }
}
