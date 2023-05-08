package org.advancedPart.StreamChallenge;

import java.time.LocalDate;
import java.util.Random;

public class MyPerson extends Person {

    public MyPerson(String name) {
        super(name);
    }


    //metoda po zaimplementowaniu ma zwracać liczbę od 0 do 100
    protected int getRandomCash() {
        Random random = new Random();

        return random.nextInt(1, 101);
    }


    //metoda po zaimplementowaniu ma zwrać aktualną datę cofniętą losową ilość lat: od 0 do 100
    public LocalDate getRandomBirthDate() {
        Random random = new Random();
        int randomYears = random.nextInt(1 ,101);
        LocalDate currentLocalDate = LocalDate.now();
        return currentLocalDate.minusYears(randomYears);
    }


    //metoda po zaimplementowaniu ma wyliczać wiek osoby w latach na podstawie jego daty urodzenia
    public int getAge() {
        LocalDate birthDate = getRandomBirthDate();
        System.out.println(birthDate);
//        LocalDate localDate = LocalDate.now();
        LocalDate currentLocalDate = LocalDate.now();
        System.out.println(currentLocalDate);
        int age = currentLocalDate.getYear() - birthDate.getYear();
        System.out.println(age);
        return age;
    }
}
