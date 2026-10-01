package blackjack.ui;
import blackjack.model.Hand;
import blackjack.game.Game;

public class TableRenderer {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showTable(Hand dealer, Hand player, boolean hideDealerCard) {
        clearScreen();
        System.out.print("\n\n");
        System.out.println("-------DEALER'S HAND-------");
        CardRenderer.printHand(dealer, hideDealerCard);
        System.out.print("\n\n\n\n");
        System.out.println("-------PLAYER'S HAND-------");
        CardRenderer.printHand(player, false);
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
        TableRenderer.clearScreen();
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│                              │");
        System.out.println("│-----------BLACKJACK----------│");
        System.out.println("│                              │");
        System.out.println("└──────────────────────────────┘");
        pause(1500);
        clearScreen();
    }
}
