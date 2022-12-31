
/**
 * This is where all of the game logic will be.
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class GameRunner
{
    public static void log(String textIn){
        System.out.println(textIn);
    }
    
    public static void main (String args[]){
        Player player1 = new Player();
        log(Integer.toString(player1.getHealth()));
        log(Integer.toString(player1.getGold()));
        
    }
}
