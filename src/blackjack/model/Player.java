package blackjack.model;

public class Player {
    private int balance = 0;
    private int currentBet = 0;
    
    public Player(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void bet(int amount){
        balance -= amount;
        currentBet = amount;
    }

    public void win(){
        balance += currentBet * 2;
    }

    public int getBetAmount(){
        return currentBet;
    }
    
}
