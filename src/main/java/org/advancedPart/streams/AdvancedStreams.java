package org.advancedPart.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class AdvancedStreams {
    public static void main(String[] args) {
        List<Owner> owners = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            owners.add(new Owner());
        }

        owners.forEach( owner -> System.out.println(owner));

        List<String> petNames = owners.get(0).getPets().stream()
                .map(pet -> pet.getName())
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(petNames);


        List<String> everyPetNames =  owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .map(pet ->  pet.getName().toUpperCase())
                .toList();
        System.out.println(everyPetNames);

        double average = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .mapToInt(pet -> pet.getAge())
                .average()
                .orElse(0);


        System.out.println(average);

        List<Integer> numbers =  owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .mapToInt(pet -> pet.getAge())
                .boxed() // moves you from IntStream (that has different methods) to normal Stream
                .toList();
        System.out.println(numbers);

    }
}

class Owner{
    private List<Pet> pets;

    public Owner() {
        pets = new ArrayList<>();
        Random random = new Random();
        int howManyPets = random.nextInt(10);
        String[] petNamesPool = {"Misia", "Ara", "Pluto", "Bruno", "Tuptuś"};
        for (int i = 0; i < howManyPets; i++) {
            int nameIndex = random.nextInt(petNamesPool.length);
            Pet pet = new Pet(petNamesPool[nameIndex]);
            pets.add(pet);
        }
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "pets=" + pets +
                '}';
    }
}

class Pet{
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;
        Random random = new Random();
        age = random.nextInt(1, 15);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
