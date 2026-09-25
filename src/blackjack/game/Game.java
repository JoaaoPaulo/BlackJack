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

    public void playRound(){
        Deck deck = new Deck();
        deck.shuffle();
    
        Hand player = new Hand();
        Hand dealer = new Hand();
    
        player.addCard(deck.draw());
        dealer.addCard(deck.draw());
        player.addCard(deck.draw());
        dealer.addCard(deck.draw());
    
        System.out.println("Player: " + player + "- " + player.getScore());
        System.out.println("Dealer: " + dealer + "- " + dealer.getScore());
    
        RoundResult winner = determineResult(player, dealer);
        System.out.println(winner);
    }
}
