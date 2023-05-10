package org.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args) {
        //FIFO - queue first in first out
        Queue<String> customers = new LinkedList<>();
        customers.add("Adam");
        customers.add("Jan");
        customers.add("Anna");
        customers.add("Janina");
        customers.add("Kuba");

        System.out.println(customers.remove());
        System.out.println(customers.remove());
        System.out.println(customers.remove());
        System.out.println(customers.remove());
        System.out.println(customers.remove());
        System.out.println(customers.poll());
        System.out.println(customers.poll());

        // System.out.println(customers.);
        //FILO - stack, first in last out
        Deque<String> books = new LinkedList<>();
        books.addLast("Clear Code");
        books.addLast("Java Basics");
        books.addLast("Functional Programming");

        System.out.println(books.removeLast());
        System.out.println(books.removeLast());
        System.out.println(books.removeLast());


    }
}
