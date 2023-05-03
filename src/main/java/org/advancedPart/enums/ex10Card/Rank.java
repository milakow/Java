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
public enum Rank {
    ACE(14, "A"),
    KING(13, "K"),
    QUEEN(12, "Q"),
    JACK(11, "J"),
    TEN(10, "10"),
    NINE(9, "9"),
    EIGHT(8, "8"),
    SEVEN(7, "7"),
    SIX(6, "6"),
    FIVE(5, "5"),
    FOUR(4, "4"),
    THREE(3, "3"),
    TWO(2, "2");

    private int strength;

    private String abbreviation;

    Rank(int strength, String abbreviation) {
        this.strength = strength;
        this.abbreviation = abbreviation;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "strength=" + strength +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
