package org.advancedPart.inheritance;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 10, 4);
        Cat cat = new Cat("Łukasz", 3, "white");
        Cat cat2 = new Cat();
        GuineaPig guineaPig = new GuineaPig("Zoska", 1, "american");


        System.out.println(dog);
        dog.bark();
        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();
        dog.eatSomething();

        System.out.println(dog);

        System.out.println("---------------");
        cat.meow();
        cat.distractTheOwner();
        cat.eatSomething();
        System.out.println("---------------");

        guineaPig.sing();
        guineaPig.biteCage();
        guineaPig.sleep();
        guineaPig.eatSomething();
        System.out.println(guineaPig);

        System.out.println("---------------");
        System.out.println("---------------");
        AnimalKeeper animalKeeper = new AnimalKeeper();
        animalKeeper.feedDog(dog);
        animalKeeper.feedCat(cat);
        animalKeeper.feedGuineaPig(guineaPig);


    }
}
