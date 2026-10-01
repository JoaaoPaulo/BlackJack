package blackjack;

import blackjack.game.*;
import blackjack.model.*;
import blackjack.ui.CardRenderer;

public class Main{
    public static void main(String[] args) {

        
        Game game = new Game();

        game.playGame();
    }
}