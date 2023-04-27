package org.advancedPart.enums.ex10Card;

/**
 * Create a Card object. The card will be described by two enum class fields Rank (Rank, e.g. nine, ace) and Suit (Color - e.g. spades).
 * Create any two cards in the main, differing in rank and suit, present them using the overridden toString method.
 * In the main display all possible ranks using the static method of enums - values().
 * Each of the ranks is supposed to have a strength assigned to it, for two 2, for three 3, etc.
 * Card objects are supposed to have a method to retrieve the strength of the card.
 * Create an additional class with a method to compare two cards, showing the larger one.
 * Make a list of all possible spade-suited cards. (use loops to automate the task).
 * Create an entire deck, i.e. a list of all possible cards for all possible suits and ranks.
 */
public enum Suit {
    SPADES(4, "s"),
    HEARTS(3, "h"),
    DIAMONDS(2, "d"),
    CLUBS(1, "c");


    private int strength;

    private String abbreviation;

    Suit(int strength, String abbreviation) {
        this.strength = strength;
        this.abbreviation = abbreviation;
    }

    public int getStrength() {
        return strength;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "strength=" + strength +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }

}
