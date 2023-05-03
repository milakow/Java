package org.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterfacesAndLists {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("Daniel");
        names.add("Iza");
        names.add("Marcin");
        names.add("Iza");
        names.add("Ada");
//        String elementTwo = names.get(2);
//        System.out.println(elementTwo);
//        sayHello(names);
    }

    public static void sayHello(LinkedList<String> list) {
        for (String name : list) {
            System.out.println(name + " says hello!");
        }
    }
}
