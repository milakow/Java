package edu.sda.java.basics;

import edu.sda.java.basics.classes.human.Human;

public class Human2DemoApp {

    public static void main(String[]args) {
        Human human = new Human();

        //as this is in different package, field "packagePrivateString is not accessible anymore
        human.getSurname();
    }


}
