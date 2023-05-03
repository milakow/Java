package org.advancedPart.inheritance.constructors;

import org.advancedPart.inheritance.animals.Animal;
import org.advancedPart.inheritance.animals.Cat;
import org.advancedPart.inheritance.animals.Dog;
import org.advancedPart.inheritance.animals.GuineaPig;

public class AnimalKeeper {

    public void feedDog(Dog dog) {
        dog.eatSomething();
        dog.bark();
//        dog.makeSound();
    }

    public void feedCat(Cat cat) {
        cat.eatSomething();
        cat.meow();
//        cat.makeSound();
    }

    public void feedGuineaPig (GuineaPig guineaPig) {
        guineaPig.eatSomething();
        guineaPig.sing();
//        guineaPig.makeSound();
    }

    public void feed(Animal animal) {
        animal.eatSomething();
        animal.makeSound(); //polymorphism
//     how to make it make a sound?
//        animal.getClass().equals(Dog.class)
        //no polymorphism approach (wrong)
        /*if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow();
        }*/

        //it is imposible to call dog methods on type Animal
//        animal.bark();
//        animal.meow();
    }

    public void feed(Animal... animals) {
        for (Animal animal : animals) {
            animal.eatSomething();
            animal.makeSound();
        }
    }
}
