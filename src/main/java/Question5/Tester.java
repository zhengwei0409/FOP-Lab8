
package Question5;

public class Tester {
    public static void main(String[] args) {
        
        Game player1 = new Game("Cat");
        Game player2 = new Game("Dinosaur");
    
        while (player1.getPlayerPoints() < 100 && player2.getPlayerPoints() < 100) {
        
            player1.rowDice();
            if(player1.getPlayerPoints() >= 100) {
                System.out.println(player1.getPlayerName() + " win!");
                break;
            }
        
            player2.rowDice();
            if(player2.getPlayerPoints() >= 100) {
                System.out.println(player2.getPlayerName() + " win!");
                break;
            }
        }
    }
}
