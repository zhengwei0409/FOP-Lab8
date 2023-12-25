
package Question5;

import java.util.Random;

public class Game {
    
    private String playerName;
    private int points;
    
    Random rand = new Random();
    
    Game(String name) {
        this.playerName = name;
        this.points = 0;
    }
    
    // play the game
    public void rowDice() {
        int diceRoll = rand.nextInt(6)+1;
        System.out.println(getPlayerName() + " rolled a " + diceRoll);
        this.points += diceRoll;
        System.out.println(getPlayerName() + "'s current points " + getPlayerPoints());
    }
    
    public String getPlayerName() {
        return this.playerName;
    }
    
    public int getPlayerPoints() {
        return this.points;
    }
}
