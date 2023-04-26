package edu.sda.java.advanced.introduction;

public class Person {

    String name;
    int age;


    //for static method I cannot access non-static variables
    public void sayHello() {
        System.out.println("My name is: " + name + " and I'm " + age + " years old");
    }

    public void makeBirthday() {
        age++;
    }
}
