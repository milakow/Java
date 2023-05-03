package org.collections;
import java.util.List;

public class MyArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new MyArrayList<>();
        names.add("Ada");
        System.out.println(names.get(0));
    }
}
