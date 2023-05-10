package org.collections;

import org.advancedPart.StreamChallenge.Person;

import java.util.*;
public class SetDemo {
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
        //order is different
        //no duplicates

        for (String name : names) {
            System.out.println(name);
        }
        Product bread = new Product("Bread");

        Set<Product> products = new HashSet<>(); // tree set sort elements automatically using method from Comparable interface
//        Set<Product> products = new TreeSet<>(); // tree set sort elements automatically using method from Comparable interface
        products.add(new Product("Milk"));
        products.add(new Product("Soda"));
        products.add(bread);
        products.add(bread);

        products.add(new Product("Bread"));
        products.add(new Product("Bread"));

        // equals ==
        System.out.println(products);



    }
}

class Product implements Comparable<Product>{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.name);
    }
}
