package edu.sda.java.basics.practise.poemtask;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Author {
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

    private String surname;
    private String nationality;
    private LocalDate dateOfBirth;

//    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//    String formattedDateStr = dmyFormat.format(dateOfBirth);

    public Author(String surname, String nationality, LocalDate dateOfBirth) { /**tu wpisac String formattedDateStr */
        this. surname = surname;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth; /**tu wpisac String formattedDateStr */
    }

    public String getSurname() {
        return surname;
    }
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
    public String getNationality() {
        return nationality;
    }
//    public void setNationality(String nationality) {
//        this.nationality = nationality;
//    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
//    public String getFormattedDateStr() {
//        return formattedDateStr;
//    }

//    public void setFormattedDateStr(String formattedDateStr) {
//        this.formattedDateStr = formattedDateStr;
//    }




}
