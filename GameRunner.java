import java.util.Scanner;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.layout.StackPane;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
/**
 * This is where all of the game logic will be.
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class GameRunner extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text();
        text.setText("Hello Nate!");
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root,600,800);  
        root.getChildren().add(text);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("TextGame");  
        primaryStage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
