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
        for (Card card : cards){
            total += card.getRank().getPoints();
        }
        return total;
    }

    public boolean isBust(){
        return(getScore()>21);
    }

    @Override 
    public String toString(){
        return cards.toString();
    }
}
