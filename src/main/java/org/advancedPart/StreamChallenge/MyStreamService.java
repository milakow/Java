package org.advancedPart.StreamChallenge;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamService implements StreamService {
    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }


    @Override
    public int distinctAndCountNumbers(int[] numbers) {
        final SumHolder sumHolder = new SumHolder();
        Arrays.stream(numbers)
                .distinct()
                .forEach( number -> sumHolder.value += number);
        return sumHolder.value;
    }

    @Override
    public List<String> computeMaleNames(List<String> names) {
        List<String> femaleNames = names.stream()
                .filter(name -> name.endsWith("a"))
                .collect(Collectors.toList());
        return femaleNames;
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> number >= minValue && number <= maxValue)
                .forEach(System.out::println);
    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        List<Integer> numbers = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        return numbers;
    }


    //dla każdego imienia z listy tworzy tworzy osobę i zwraca listę tych osób, wykorzystaj własną impl klasy Person
    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
        List<Person> people = names.stream()
                .map(name -> new MyPerson(name))
                .collect(Collectors.toList());
        return people;
    }


    //zwraca osoby o ID powyżej zadanej wartości
    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        List<Person> peopleWithIdGreaterThanGiven = people.stream()
//                .map(Person::getId)
                .filter(person -> person.getId() > id)
                .collect(Collectors.toList());
        return peopleWithIdGreaterThanGiven;
    }

    //sprawdza czy wśród tych osób jest powyżej 60 roku życia
    @Override
    public boolean hasSenior(List<Person> people) {
        people.stream()
                .anyMatch(person -> person.getAge() > 60);
        return true;
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return 0;
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
//        Person person = people.stream()
//                .mapToDouble(Person :: getCash)
//                .sorted()
//                .collect(Collectors.to)
//
//
//        return person;
        return null;
    }


    //wyciąga średni wiek osób w latach jeśli nie ma żadnej osoby może zwrócić -1
    @Override
    public double computeAverageAge(List<Person> people) {
        return 0;
    }
}

class SumHolder{
    int value = 0;
        }

class CashSumHolder{
    double value = 0;
}