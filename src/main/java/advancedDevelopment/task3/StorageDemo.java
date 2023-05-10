package advancedDevelopment.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StorageDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 15); // place element inside map
        int number = map.get("key1"); // get the element under the given key
        System.out.println(number);

        map.put("key2", 15); // put element
        map.put("key1", 12); // override element under key1
        System.out.println(map);

        boolean exists = map.containsKey("jakis klucz"); // if this key exists in a map
        System.out.println(exists);
        boolean exists2 = map.containsValue(90); // if this value exists
        System.out.println(exists2);
        System.out.println("===========");

        System.out.println(map.keySet());
        map.remove("key2"); // remove a key and its value
        for (String keys : map.keySet()) { // Set<String> - iterate over keys in a map

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // iterate over entries (key and value)
            String key = entry.getKey();
            int value = entry.getValue();


        }

        map.forEach((key, value) -> { // same as above

        });
    }

}
