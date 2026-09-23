package blackjack;

import blackjack.model.Deck;

public class Main{
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck.getCard());
        deck.shuffle();
        System.out.println(deck.getCard());
        System.out.println(deck.draw());
        System.out.println(deck.draw());
        System.out.println(deck.size());   
    }
}