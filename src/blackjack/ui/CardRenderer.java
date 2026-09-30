package blackjack.ui;

import blackjack.model.*;

public class CardRenderer {
    public static String[] render(Card card){
        String suitSymbol = card.getSuit().getSymbol();

        switch (card.getRank()){
            case ACE:
                String[] cardAce = {
                    "┌─────────┐",
                    "│ A       │",
                    "│         │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│         │",
                    "│       A │",
                    "└─────────┘"
                }; 
                return cardAce;
            case TWO:
                String[] cardTwo = {
                    "┌─────────┐",
                    "│ 2       │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│       2 │",
                    "└─────────┘"
                };
                return cardTwo;
            case THREE:
                String[] cardThree = {
                    "┌─────────┐",
                    "│ 3       │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│       3 │",
                    "└─────────┘"
                };
                return cardThree;
            case FOUR:
                String[] cardFour = {
                    "┌─────────┐",
                    "│ 4       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       4 │",
                    "└─────────┘"
                };
                return cardFour;
            case FIVE:
                String[] cardFive = {
                    "┌─────────┐",
                    "│ 5       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       5 │",
                    "└─────────┘"
                };
                return cardFive;
            case SIX:
                String[] cardSix = {
                    "┌─────────┐",
                    "│ 6       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│         │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│         │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       6 │",
                    "└─────────┘"
                };
                return cardSix;
            case SEVEN:
                String[] cardSeven = {
                    "┌─────────┐",
                    "│ 7       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│         │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│    " + suitSymbol + "    │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       7 │",
                    "└─────────┘"
                };
                return cardSeven;
            case EIGHT:
                String[] cardEight = {
                    "┌─────────┐",
                    "│ 8       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│    " + suitSymbol + "    │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│    " + suitSymbol + "    │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       8 │",
                    "└─────────┘"
                };
                return cardEight;
            case NINE:
                String[] cardNine = {
                    "┌─────────┐",
                    "│ 9       │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│    " + suitSymbol + "    │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│       9 │",
                    "└─────────┘"
                };
                return cardNine;
            case TEN:
                String[] cardTen = {
                    "┌─────────┐",
                    "│ 10      │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│  " + suitSymbol + "   " + suitSymbol + "  │",
                    "│      10 │",
                    "└─────────┘"
                };
                return cardTen;
            case JACK:
                String[] cardJack = {
                    "┌─────────┐",
                    "│ J       │",
                    "│         │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│         │",
                    "│       J │",
                    "└─────────┘"
                };
                return cardJack;
            case QUEEN:
                String[] cardQueen = {
                    "┌─────────┐",
                    "│ Q       │",
                    "│         │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│         │",
                    "│       Q │",
                    "└─────────┘"
                };
                return cardQueen;
            case KING:
                String[] cardKing = {
                    "┌─────────┐",
                    "│ K       │",
                    "│         │",
                    "│         │",
                    "│    " + suitSymbol + "    │",
                    "│         │",
                    "│         │",
                    "│       K │",
                    "└─────────┘"
                };
                return cardKing;
            default:
                String[] cardDefault = {
                    "┌─────────┐",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "│         │",
                    "└─────────┘"
                };
                return cardDefault;
        }
    }

    public static String[] renderBack(){
        String[] cardBack = {
            "┌─────────┐",
            "│░▒░▒░▒░▒░│",
            "│▒░▒░▒░▒░▒│",
            "│░▒░▒░▒░▒░│",
            "│▒░▒░▒░▒░▒│",
            "│░▒░▒░▒░▒░│",
            "│▒░▒░▒░▒░▒│",
            "│░▒░▒░▒░▒░│",
            "└─────────┘"
        };
        return cardBack;
    }

    public static void printHand(Hand hand){
        String[] cardLines = new String[9];
        for (int i = 0; i < 9; i++){
            cardLines[i] = "";
        }

        for (Card card : hand.getCards()){
            String[] cardRender = render(card);
            for (int i = 0; i < 9; i++){
                cardLines[i] += cardRender[i] + " ";
            }
        }

        for (String line : cardLines){
            System.out.println(line);
        }
    }
}
