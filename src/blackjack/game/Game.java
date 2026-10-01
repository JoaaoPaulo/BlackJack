package blackjack.game;

import java.util.InputMismatchException;
import java.util.Scanner;
import blackjack.model.*;
import blackjack.ui.*;

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
        TableRenderer.showTitle();
        Deck deck = new Deck();
        deck.shuffle();
    
        Hand player = new Hand();
        Hand dealer = new Hand();
    
        player.addCard(deck.draw());
        TableRenderer.showTable(dealer, player, true);
        dealer.addCard(deck.draw());
        TableRenderer.showTable(dealer, player, true);
        player.addCard(deck.draw());
        TableRenderer.showTable(dealer, player, true);
        dealer.addCard(deck.draw());
        TableRenderer.showTable(dealer, player, true);

    
        playerTurn(deck, player, dealer);
        if (!player.isBust()){
            dealerTurn(deck, dealer, player);
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

    public void playerTurn(Deck deck, Hand player, Hand dealer){
        int option = 1;
        while(option==1 && !player.isBust()){
            //CardRenderer.printHand(player, false);
            //System.out.println("Player: " +  player.getScore());
            option = readOption();

            if(option==1){
                hit(deck, player);
                TableRenderer.showTable(dealer, player, true);
            }
        }
    }

    public void dealerTurn(Deck deck, Hand dealer, Hand player){
        TableRenderer.showTable(dealer, player, false);
        while(dealer.getScore()<17){
            dealer.addCard(deck.draw());
            TableRenderer.showTable(dealer, player, false);
        }
    }

    public void hit(Deck deck, Hand player){
        player.addCard(deck.draw());
    }

    private int readOption() {
        while (true) {
            System.out.println("1 - Hit");
            System.out.println("2 - Stand");
            try {
                int option = sc.nextInt();
                if (option == 1 || option == 2) {
                    return option;
                } else {
                    System.out.println("Invalid option. Please choose 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }
    }
}
