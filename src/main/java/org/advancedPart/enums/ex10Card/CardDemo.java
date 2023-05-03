package org.advancedPart.enums.ex10Card;

import edu.sda.java.advanced.abstraction.Car;

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
public class CardDemo {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.JACK, Suit.SPADES);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);

        int strength = card1.getStrength();
        System.out.println(card1 + " strength " + strength);
        System.out.println();
        System.out.println(card1);
        System.out.println(card2);

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println("All possible ranks: ");
        for (Rank c : Rank.values()) {
            System.out.println(c);
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println("All possible spade-suited cards: ");
        Card[] spadeCards = new Card[13];
        for (int i = 0; i < spadeCards.length; i++) {
            for (Rank r : Rank.values()) {
                spadeCards[i] = new Card(r, Suit.SPADES);
                i += 1;
            }
        }
        for (Card spadeCard : spadeCards) {
            System.out.println(spadeCard);
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        Card[] allCards = new Card[52];
        for (int i = 0; i < allCards.length; i++) {
            for (Rank r : Rank.values()) {
                for (Suit s : Suit.values()) {
                    allCards[i] = new Card(r, s);
                    i += 1;
                }
            }
        }

        System.out.println("All possible cards: ");
        for (Card c : allCards) {
            System.out.println(c);
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("War game");

        WarGame warGame = new WarGame();
        System.out.println(warGame.compareStrength(card1, card2));
        warGame.printWhoIsTheWinner(card1, card2);

        Card card3 = new Card(Rank.EIGHT, Suit.DIAMONDS);
        Card card4 = new Card(Rank.THREE, Suit.HEARTS);
//        System.out.println(warGame.compareStrength(card3, card4));
        warGame.printWhoIsTheWinner(card3,card4);

    }
}
