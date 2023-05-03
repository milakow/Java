package org.collections;
import java.util.Locale;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyNode<String> myNode = new MyNode<>("abc");
        MyNode<Integer> myNode2 = new MyNode<>(123);

        System.out.println(myNode.getData().toUpperCase());
        System.out.println(myNode2.getData());


        String text = (String) myNode.getData();
        int number = (int) myNode2.getData();
        System.out.println(text.toUpperCase());
        System.out.println(number);
    }
}
