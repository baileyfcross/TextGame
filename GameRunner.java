import java.util.Scanner;
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
    
    public static void drawBox(String boxIn){
        String newBox = new PopupBox(boxIn).redrawTextBox();
        System.out.print(newBox);
    }
    
    public static void main (String args[]){
        Player player1 = new Player();
        log(Integer.toString(player1.getHealth()));
        log(Integer.toString(player1.getGold()));
        drawBox("What is your name?");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        drawBox("Hello " + name + ", nice to meet you!");
        
        
    }
}
