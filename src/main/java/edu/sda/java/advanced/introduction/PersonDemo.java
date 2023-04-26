package edu.sda.java.advanced.introduction;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Adam";
        person1.age = 30;
        Person person2 = new Person();
        person2.name = "Iza";
        person2.age = 33;

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.name);
        System.out.println(person2.name);

        person1.sayHello();

        person2.sayHello();

        person1.makeBirthday();
        person1.sayHello();
    }
}
