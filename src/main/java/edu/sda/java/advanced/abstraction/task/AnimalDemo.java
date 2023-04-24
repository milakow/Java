package edu.sda.java.advanced.abstraction.task;

public class AnimalDemo {
    public static void main(String[] args) {
        Bird bird1 = new Bird("sparrow");
        Fish fish1 = new Fish("cod");
        Elephant elephant1 = new Elephant("xyz");

        Animal[] animals = new Animal[] {bird1, fish1, elephant1};
        //for loop

        bird1.move();
        fish1.move();
        elephant1.move();

//        System.out.println(bird1.setMovement("flying"));
        System.out.println("==================================");
        System.out.println("Anonymous animal: ");
        Animal anonymous = new Animal("whale") {
            @Override
            public void move() {
                System.out.println("I am able to swim");
            }
        };
        System.out.println(anonymous.name);
        anonymous.move();
    }
}
