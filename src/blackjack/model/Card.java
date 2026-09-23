package blackjack.model;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }
}
