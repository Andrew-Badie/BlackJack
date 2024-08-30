package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);
private String message;
  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
      System.out.println("House holds: "+game.getHouseCards());
      System.out.println("You hold: "+game.getYourCards());
      
  
    }

  @Override
    public boolean hitMe() {
      System.out.println("Would you like another card?");
      message=user.nextLine();
        message = message.toLowerCase();
        
        if (message.equals("yes")){
            return true;
        }
        else{
            return false;
        }
     
    }

  @Override
    public void gameOver() {
    game.getHouseCards();
    game.getYourCards();
    int scoreH = game.score(game.getHouseCards());
   int scoreY =  game.score(game.getYourCards());
    if(scoreY>21&&scoreY==scoreH){
        System.out.println("The House wins!");
    }
    else {
        System.out.println("You win!");
    }
        
    }

}