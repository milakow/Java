package org.collections;

import org.advancedPart.exceptions.shop.Product;

import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {

        //Lists, Maps, Sets, Queues, Dequeues
        List<String> names = new ArrayList<>();
        names.add("Izaa");
        names.add("Marcin");
        names.add("Ada");
        names.add("Daniel");
        names.add("Iza");
        names.add("Izydor");
        names.add("Jan");

        Collections.sort(names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                if (result == 0) {
                    return o1.compareTo(o2);
                }


                return o1.length() - o2.length();
               /* if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;*/
            }
        });

        System.out.println(names);


        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk"));
        products.add(new Product("Soda"));
        products.add(new Product("Bread"));
        products.add(new Product("Bread"));

//        Collections.sort(products);
        System.out.println(products);

        // equals ==
        System.out.println(products);



    }
}
