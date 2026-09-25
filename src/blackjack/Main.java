package blackjack;

import blackjack.model.*;

public class Main{
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand hand = new Hand();
        hand.addCard(new Card(Rank.ACE, Suit.SPADES));
        hand.addCard(new Card(Rank.ACE, Suit.HEARTS));
        hand.addCard(new Card(Rank.KING, Suit.HEARTS));

        System.out.println(hand.getScore());
        System.out.println(hand.isBust());


    }
}