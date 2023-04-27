package org.advancedPart.inheritance;

import org.advancedPart.inheritance.Animal;
import org.advancedPart.inheritance.Dog;
import org.advancedPart.inheritance.Cat;
import org.advancedPart.inheritance.Mouse;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 10, 4);
        Cat cat = new Cat("Łukasz", 3, "white");
        Cat cat2 = new Cat();
        GuineaPig guineaPig = new GuineaPig("Zoska", 1, "american");


        System.out.println(dog);
//        dog.bark();
        dog.makeSound();
        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();
        dog.eatSomething();

        System.out.println(dog);

        System.out.println("---------------");
//        cat.meow();
        cat.makeSound();
        cat.distractTheOwner();
        cat.eatSomething();
        System.out.println("---------------");

//        guineaPig.sing();
        guineaPig.makeSound();
        guineaPig.biteCage();
        guineaPig.sleep();
        guineaPig.eatSomething();
        System.out.println(guineaPig);

        System.out.println("---------------");
        System.out.println("---------------");
        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog);
//        animalKeeper.feedCat(cat);
//        animalKeeper.feedGuineaPig(guineaPig);

        System.out.println("Better way: ");
        animalKeeper.feed(dog);
        animalKeeper.feed(cat);
        animalKeeper.feed(guineaPig);

        System.out.println("---------------");
        System.out.println("---------------");

        //polymorphism example
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
        //it is not possible to make object (instance) directly from abstract class
        //and it is good because we don't want them in our code
        // animal = new Animal();

        System.out.println("----------");
        Mouse mouse = new Mouse("Mickey",5);
        Animal[] animals = {dog, dog2, cat, cat2, animal, mouse, guineaPig};
        //animalKeeper.feed(animals);
        animalKeeper.feed(dog, dog2, cat, cat2, animal, mouse, guineaPig);
        System.out.println(animals.length);

        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("Testing overriding sound-producing method:");
        for (Animal anim : animals) {
            anim.makeSound();
        }

    }
}
