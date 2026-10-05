package blackjack.game;

import java.util.InputMismatchException;
import java.util.Scanner;
import blackjack.model.*;
import blackjack.ui.*;

public class Game {
    private Scanner sc = new Scanner(System.in);
    private Player player = new Player(10000);

    public RoundResult determineResult (Hand playerHand, Hand dealer, Player player){
        
        if (playerHand.isBust()) {
            return RoundResult.DEALER_WINS;
        } else if(dealer.isBust()){
            return RoundResult.PLAYER_WINS;
        } else if(playerHand.getScore()>dealer.getScore()){
            return RoundResult.PLAYER_WINS;
        } else if(dealer.getScore()>playerHand.getScore()){
            return RoundResult.DEALER_WINS;
        } else{
            return RoundResult.PUSH;
        }
        
    }

    public void pay(RoundResult result, Player player){
        if(result.equals(RoundResult.PLAYER_WINS)){
            player.win();
        } else if(result.equals(RoundResult.PUSH)){
            player.bet(- player.getBetAmount());
        }
    }
    
    public void playRound(){
        TableRenderer.showTitle();
        Deck deck = new Deck();
        deck.shuffle();
    
        Hand playerHand = new Hand();
        Hand dealer = new Hand();
    
        System.out.println("Your current balance: " + player.getBalance());
        player.bet(readBetAmount(player));

        playerHand.addCard(deck.draw());
        TableRenderer.showTable(dealer, playerHand, player, true);
        dealer.addCard(deck.draw());
        TableRenderer.showTable(dealer, playerHand, player, true);
        playerHand.addCard(deck.draw());
        TableRenderer.showTable(dealer, playerHand, player, true);
        dealer.addCard(deck.draw());
        TableRenderer.showTable(dealer, playerHand, player, true);

    
        playerTurn(deck, playerHand, dealer, player);
        if (!playerHand.isBust()){
            dealerTurn(deck, dealer, playerHand, player);
        } else {
            TableRenderer.showTable(dealer, playerHand, player, false);
        }


        System.out.println("\nDealer: " + dealer.getScore());
        System.out.println("Player: " + playerHand.getScore());
        System.out.println(determineResult(playerHand, dealer, player));
        pay(determineResult(playerHand, dealer, player), player);
    }

    public void playGame(){
        String option;
        do {
            playRound();
            System.out.println("Do you want to play again? (y/n)");
            option = sc.next();
        } while (option.equalsIgnoreCase("y"));
    }

    public void playerTurn(Deck deck, Hand playerHand, Hand dealer, Player player){
        int option = 1;
        while(option==1 && !playerHand.isBust()){
            option = readOption();

            if(option==1){
                hit(deck, playerHand);
                TableRenderer.showTable(dealer, playerHand, player, true);
            }
        }
    }

    public void dealerTurn(Deck deck, Hand dealer, Hand playerHand, Player player){
        TableRenderer.showTable(dealer, playerHand, player, false);
        while(dealer.getScore()<17){
            dealer.addCard(deck.draw());
            TableRenderer.showTable(dealer, playerHand, player, false);
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

    private int readBetAmount(Player player) {
        while (true) {
            System.out.print("Enter your bet amount: ");
            try {
                int betAmount = sc.nextInt();
                if (betAmount > 0 && betAmount <= player.getBalance()) {
                    return betAmount;
                } else {
                    System.out.println("Invalid bet amount. Please enter a positive number not exceeding your balance.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }
    }

    
}
