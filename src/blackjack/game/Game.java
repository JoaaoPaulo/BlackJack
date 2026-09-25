package blackjack.game;

import blackjack.model.*;

public class Game {
    public RoundResult determineResult (Hand player, Hand dealer){

        if (player.isBust()) {
            return RoundResult.DEALER_WINS;
        } else if(dealer.isBust()){
            return RoundResult.PLAYER_WINS;
        } else if(player.getScore()>dealer.getScore()){
            return RoundResult.PLAYER_WINS;
        } else if(dealer.getScore()>player.getScore()){
            return RoundResult.DEALER_WINS;
        } else{
            return RoundResult.PUSH;
        }
    }
}
