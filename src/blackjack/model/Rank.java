package blackjack.model;

public enum Rank {
    ACE(11, "A"), 
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    private final int points;
    private final String symbol;

    Rank(int points, String symbol) {
        this.points = points;
        this.symbol = symbol;
    }

    public int getPoints() {
        return points;
    }

    public String getSymbol() {
        return symbol;
    }
}