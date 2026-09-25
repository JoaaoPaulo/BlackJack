package blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public int getScore(){
        int total = 0;
        int aces = 0;
        for (Card card : cards){
            total += card.getRank().getPoints();

            if (card.getRank() == Rank.ACE){aces++;}
        }

        while (aces > 0 && total>21){
            aces--;
            total-=10;
        }

        return total;
    }

    public boolean isBust(){
        return getScore()>21;
    }

    @Override 
    public String toString(){
        return cards.toString();
    }
}
