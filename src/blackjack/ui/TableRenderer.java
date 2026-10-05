package blackjack.ui;
import java.io.IOException;

import blackjack.model.*;

public class TableRenderer {
    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void showTable(Hand dealer, Hand playerHand, Player player, boolean hideDealerCard) {
        clearScreen();
        System.out.print("\n\n");
        System.out.println("-------DEALER'S HAND-------");
        CardRenderer.printHand(dealer, hideDealerCard);
        System.out.print("\n\n\n");
        System.out.println("-------PLAYER'S HAND-------");
        CardRenderer.printHand(playerHand, false);
        System.out.println("Balance: " + player.getBalance());
        System.out.println("Bet: " + player.getBetAmount());
        pause(1000);
    }





    public static void pause(int ms){
        try{
            Thread.sleep(ms);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void showTitle(){
        clearScreen();
        System.out.println("""
                                     _______   __                      __           _____                      __       
                                    /       \\ /  |                    /  |         /     |                    /  |      
                                    $$$$$$$  |$$ |  ______    _______ $$ |   __    $$$$$ |  ______    _______ $$ |   __ 
                                    $$ |__$$ |$$ | /      \\  /       |$$ |  /  |      $$ | /      \\  /       |$$ |  /  |
                                    $$    $$< $$ | $$$$$$  |/$$$$$$$/ $$ |_/$$/  __   $$ | $$$$$$  |/$$$$$$$/ $$ |_/$$/ 
                                    $$$$$$$  |$$ | /    $$ |$$ |      $$   $$<  /  |  $$ | /    $$ |$$ |      $$   $$<  
                                    $$ |__$$ |$$ |/$$$$$$$ |$$ \\_____ $$$$$$  \\ $$ \\__$$ |/$$$$$$$ |$$ \\_____ $$$$$$  \\ 
                                    $$    $$/ $$ |$$    $$ |$$       |$$ | $$  |$$    $$/ $$    $$ |$$       |$$ | $$  |
                                    $$$$$$$/  $$/  $$$$$$$/  $$$$$$$/ $$/   $$/  $$$$$$/   $$$$$$$/  $$$$$$$/ $$/   $$/ 

                """);
        pause(2500);
        clearScreen();
        
    }
}

