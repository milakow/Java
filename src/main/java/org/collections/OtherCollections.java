package org.collections;

import java.util.HashSet;
import java.util.Set;

public class OtherCollections {
    public static void main(String[] args) {
        //Lists, Maps, Sets, Queues, Dequeues

        Set<String> names = new HashSet<>();
        names.add("Iza");
        names.add("Marcin");
        names.add("Ada");
        names.add("Daniel");
        names.add("Iza");
        names.add("Izydor");
        names.add("Jan");

        System.out.println(names);
    }
}
