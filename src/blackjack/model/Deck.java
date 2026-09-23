package blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();
 

    public Deck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public int size(){
        return cards.size();
    }

    public Card getCard(int posicao){
        return cards.get(posicao);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
