package blackjack.model;

public enum Suit {
    DIAMONDS("♦"), SPADES("♠"), HEARTS("♥"), CLUBS("♣");

    private final String symbol;

    private Suit(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }
}
