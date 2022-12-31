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
    
    private static void sleep(int numberOfSeconds) {
        try
        {
            Thread.sleep(numberOfSeconds);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
    
    public static void main (String args[]) {
        Player player1 = new Player();
        log(Integer.toString(player1.getHealth()));
        log(Integer.toString(player1.getGold()));
        drawBox("What's your name?");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        drawBox("Hello " + name + ", nice to meet you!");
        sleep(5000);
        drawBox("Well I suppose we should get to introducin' then");
        sleep(2000);
        drawBox("My name is Lester");
        sleep(2000);
        drawBox("I'm the local sheriff 'round here.");
        
        
        
    }
}
