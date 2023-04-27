package org.advancedPart.enums.ex10Card;

public class CardDemo {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.JACK, Suit.SPADES);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);

        card1.toString();
        card2.toString();
    }



}
