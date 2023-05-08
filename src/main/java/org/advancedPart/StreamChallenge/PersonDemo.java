package org.advancedPart.StreamChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PersonDemo {
    //za zadanię można otrzymać 14 punktów po 1 za każdą zaimplementowaną abstrakcyjną metodę

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda", "Iza"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19, 19, 23, 29};

        StreamService streamService = new MyStreamService();

        //1
        streamService.sortAndPrint(names);
        //2
        System.out.println(streamService.distinctAndCountNumbers(primeNumbers));
        //3
        System.out.println(streamService.computeMaleNames(names));
        //4
        streamService.printNumbersOfRange(primeNumbers, 0, 50);
        //5
        System.out.println(streamService.computeNamesLength(names));


        //miejsce na Twoje testy zaimplementowanych metod. Jeśli umiesz możesz wykonać testy jednostkowe udowadniające
        //poprawne działanie zaimplementowanych metod

        MyPerson myPerson = new MyPerson("Anna");
        System.out.println("random cash: " + myPerson.getRandomCash());
        System.out.println("random birth date: " + myPerson.getRandomBirthDate());
        System.out.println("random age: " + myPerson.getAge()); //?????????????

        List<Person> people = streamService.buildPeopleWithNames(names);
        System.out.println(people);
        List<Person> peopleWithIdGreaterThanGiven = streamService.findPeopleOfIdGreaterThan(people, 3);
        System.out.println(peopleWithIdGreaterThanGiven);
        System.out.println(streamService.hasSenior(people));
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>


    }
}
