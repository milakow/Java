package edu.sda.java.basics.practise.poemtask;

import edu.sda.java.basics.practise.poemtask.Poem;
import edu.sda.java.basics.practise.poemtask.Author;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    /**
     * Write an application that consists of few classes:
     * a. Author class, representing an author – poem writer, which consists of fields surname
     * and nationality (both of type String)
     * b. Poem class, representing poem, which consists of fields creator (type Author) and
     * stropheNumbers (type int – numbers of strophes in poem)
     * c. Main class, with main method, inside which you will:
     *    Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
     *    Write a surname of an author, that wrote a longest poem (let your application calculate it!)
     */
    /**
     *
     * Add a date of creation to Poem class
     * Add a date of birth to Author class
     * Add a number of books sold to Poem class
     *
     * Add 3 - 5 more Poems, at least 3 Authors should be created too
     *
     * Print authors from oldest to youngest
     * Print poems from least sold to top sold
     *
     */
    /**
     * Print authors born between 1975 and 1995
     * Print title and year of poem of authors born in 1980's
     */
    public static void main(String[] arg) {

        Poem poem1 = new Poem();
        Author creator1 = new Author("Szymborska", "polish", LocalDate.of(1923, 7, 2));
//        creator1();
//        creator1.setNationality("polish");
        poem1.setCreator(creator1);
        poem1.setTitle("Dlon");
        poem1.setStropheNumbers(7);
        poem1.setDateOfCreation(LocalDate.of(2012, 4, 4));
        poem1.setNumOfSoldBooks(505);
        Poem[] poems = new Poem[5];

        poems[0] = poem1;


        Poem poem2 = new Poem();
        Author creator2 = new Author("Shakespeare", "english", LocalDate.of(1564, 4, 1));
//        creator2.setSurname("Shakespeare");
//        creator2.setNationality("english");
        poem2.setCreator(creator2);
        poem2.setTitle("Sonnet 18");
        poem2.setStropheNumbers(14);
        poem2.setDateOfCreation(LocalDate.of(1596, 12, 24));
        poem2.setNumOfSoldBooks(459);
        poems[1] = poem2;


        Poem poem3 = new Poem();
        Author creator3 = new Author("Herbert", "polish", LocalDate.of(1924, 10, 29));
//        creator3.setSurname("Herbert");
//        creator3.setNationality("polish");
        poem3.setCreator(creator3);
        poem3.setTitle("Cesarz");
        poem3.setStropheNumbers(6);
        poem3.setDateOfCreation(LocalDate.of(1957, 7, 20));
        poem3.setNumOfSoldBooks(458);
        poems[2] = poem3;

        Poem poem4 = new Poem();
        Author creator4 = new Author("Milosz", "polish", LocalDate.of(1981, 6, 30)); // data to 1911
        poem4.setCreator(creator4);
        poem4.setTitle("To");
        poem4.setStropheNumbers(29);
        poem4.setDateOfCreation(LocalDate.of(2000, 2, 6));
        poem4.setNumOfSoldBooks(1000);
        poems[3] = poem4;

        Poem poem5 = new Poem();
        Author creator5 = new Author("Twardowski", "polish", LocalDate.of(1985, 6,1)); ///data to 1915
        poem5.setCreator(creator5);
        poem5.setTitle("Niebieskie okulary");
        poem5.setStropheNumbers(40);
        poem5.setDateOfCreation(LocalDate.of(1980, 4, 2));
        poem5.setNumOfSoldBooks(800);
        poems[4] = poem5;

//        Poem poem6 = new Poem();
//        Author creator6 = new Author()


//        Poem[] poems = {poem1, poem2, poem3}
//        System.out.println(poems[1].getCreator().getSurname());
        int maxStrophes = 0;
        String longestPoemAuthor = "";
        for (Poem poem : poems) {
            int strophes = poem.getStropheNumbers();
            if (strophes > maxStrophes) {
                maxStrophes = strophes;
                longestPoemAuthor = poem.getCreator().getSurname();
            }
        }
        System.out.println("The surname of an author, that wrote a longest poem is: " + longestPoemAuthor);
        System.out.println("\n");


        System.out.println("Printing authors from oldest to youngest:");
        // printing authors from oldest to youngest
        Author[] authors = {creator1, creator2, creator3, creator4, creator5};
        Arrays.sort(authors, (a1, a2) -> a1.getDateOfBirth().compareTo(a2.getDateOfBirth()));
        for (Author author : authors) {
            System.out.println("Name: " + author.getSurname() + ", Date of Birth: " + author.getDateOfBirth());
        }
        System.out.println("\n");


        System.out.println("Printing poems from least sold to top sold:");
        // print poems from least sold to top sold
        Arrays.sort(poems, (p1, p2) -> Integer.compare(p1.getNumOfSoldBooks(), p2.getNumOfSoldBooks()));
        for (Poem poem : poems) {
            System.out.println("Title: " + poem.getTitle() + ", Numbers of Sold Books: " + poem.getNumOfSoldBooks());
        }
        System.out.println("\n");

        System.out.println("Printing authors born between 1975 and 1995:");
        // Print authors born between 1975 and 1995
        for (Author author : authors) {
            if (author.getDateOfBirth().getYear() > 1975 && author.getDateOfBirth().getYear() < 1995) {
                System.out.println("Name: " + author.getSurname() + ", date of birth: " + author.getDateOfBirth());
            }
        }
        System.out.println("\n");

        System.out.println("Printing title and year of poem of authors born in 1980's:");
        //Print title and year of poem of authors born in 1980's
        for (Poem poem : poems) {
            if (poem.getCreator().getDateOfBirth().getYear() > 1979 && poem.getCreator().getDateOfBirth().getYear() < 1990) {
//        }
//        for (Author author : authors) {
//            if (author.getDateOfBirth().getYear() > 1979 && author.getDateOfBirth().getYear() < 1990) {
                System.out.println("Title: " + poem.getTitle() + ", year of poem " + poem.getDateOfCreation());
            }
        }

    }
}

