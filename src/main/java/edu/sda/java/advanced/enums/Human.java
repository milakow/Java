package edu.sda.java.advanced.enums;


/**
 * If we have class that does not allow modification
 * of its fields - it's called IMMUTABLE
 *
 * That's good type of classes to work in multi-threaded environment
 */

public class Human {
    /**
     * final means that once we set a field
     * we won't change its value
     *
     * final fields can be set in a constructor
     * or when creating a class
     */
    private final String name;
    private final String surname;
    private Gender gender;

    public Human(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Human(String name, String surname, String genderAbbrev) {
        this.name = name;
        this.surname = surname;
        this.gender = Gender.findByAbbrev(genderAbbrev); //call to static method, on enum and not on instance
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}
