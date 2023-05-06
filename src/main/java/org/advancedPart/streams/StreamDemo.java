package org.advancedPart.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Iza");
        names.add("Marcin");
        names.add("Ada");
        names.add("Daniel");
        names.add("Iza");
        names.add("Izydor");
        names.add("Jan");

        names.forEach(name -> System.out.println(name));
        //  names.removeIf(name -> name.length() > 3);
        System.out.println(names);

        System.out.println(names.stream().count());

        names.stream()
                .map(name -> name.repeat(3))
                // Iza -> IzaIzaIza
                .map(name3Times -> name3Times.substring(2, 5))
                // IzaIzaIza -> aIz  (Iz|aIz|aIza)
                .sorted()
                .distinct() // removes duplicates
                .forEach(nameFragment -> System.out.println(nameFragment));
        // aIz -> print

        System.out.println(names);


        List<String> namesWithoutI =  names.stream()
                .filter(name -> !name.startsWith("I")) // if it is NOT starting with I it will stay
                // .toList()
                .collect(Collectors.toList());



        System.out.println(namesWithoutI);

        String result =  names.stream()
                .sorted()
                .filter(name -> name.length()>100) // i get rid of all elements
                .findFirst() // taking first will return for me empty container (Optional)
//              .orElse(""); // if it's empty give me "" String
                //.get(); // if it's empty throw NoSuchElementException
                .orElseThrow(  () -> new NullPointerException());

        System.out.println(result);

        //Optionals are designed for situation where you are looking for one element and you are not sure you get one
    }
}
