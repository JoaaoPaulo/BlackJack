package blackjack.game;

import java.util.Scanner;

import blackjack.model.*;

public class Game {
    private Scanner sc = new Scanner(System.in);

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
    
        System.out.println("\nDealer: [" + dealer.getFirstCard() + ", ??]");
        playerTurn(deck, player);
        if (!player.isBust()){
            dealerTurn(deck, dealer);
        }

        System.out.println("\nDealer: " + dealer + "- " + dealer.getScore());
        System.out.println("Player: " + player + "- " + player.getScore());
        System.out.println(determineResult(player, dealer));
    }

    public void playGame(){
        String option;
        do {
            playRound();
            System.out.println("Do you want to play again? (y/n)");
            option = sc.next();
        } while (option.equalsIgnoreCase("y"));
    }

    public void playerTurn(Deck deck, Hand player){
        int option = 1;
        while(option==1 && !player.isBust()){
            System.out.println("Player: " + player + "- " + player.getScore());
            System.out.println("1 - Hit");
            System.out.println("2 - Stand");
            option = sc.nextInt();
            while(option!=1 && option!=2){
                System.out.println("Invalid option. Please choose 1 or 2.");
                option = sc.nextInt();
            }

            if(option==1){
                hit(deck, player);
            }
        }
    }

    public void dealerTurn(Deck deck, Hand dealer){
        while(dealer.getScore()<17){
            dealer.addCard(deck.draw());
            System.out.println("\nDealer: " + dealer + "- " + dealer.getScore());
        }
    }

    public void hit(Deck deck, Hand player){
        player.addCard(deck.draw());
    }

}
