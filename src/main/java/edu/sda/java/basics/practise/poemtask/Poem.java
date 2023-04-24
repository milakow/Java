package edu.sda.java.basics.practise.poemtask;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Poem {
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
    private Author creator;

    private int stropheNumbers;

    private String Title;

    private LocalDate dateOfCreation;
//    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy");

//    public String getFormattedDateStr() {
//        return formattedDateStr;
//    }

//    public void setFormattedDateStr(String formattedDateStr) {
//        this.formattedDateStr = formattedDateStr;
//    }

//    private String formattedDateStr = dmyFormat.format(dateOfCreation);

    private int numOfSoldBooks;

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

//    public SimpleDateFormat getDmyFormat() {
//        return dmyFormat;
//    }


    public int getNumOfSoldBooks() {
        return numOfSoldBooks;
    }

    public void setNumOfSoldBooks(int numOfSoldBooks) {
        this.numOfSoldBooks = numOfSoldBooks;
    }

    /**
     * without below method i cannot enter the date of creation in main file
     */

    public void setDateOfCreation(String date) {
    }
}
