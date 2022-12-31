/**
 * Popup Box for Text Interactions
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class PopupBox
{
    private String textWanted;
    private String box = 
    """
         ++++++++++++++++++++++++++++++++++++++++++++++++++++
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         +                                                  +
         ++++++++++++++++++++++++++++++++++++++++++++++++++++
        """;
        
    private int startingIndex;
    /**
     * Constructor for objects of class PopupBox
     */
    public PopupBox(String newValue)
    {       
        textWanted = newValue;
    }
    
    /***
     * Starting Index = 325 (0)
     * Middle Index = 351 (26)
     * Ending Index = 377 (52)
     */
    private void computeTextInsert(String box){
        char[] textWantedCharArray = textWanted.toCharArray();
        char[] boxCharArray = box.toCharArray();
        int counter = 0;
        startingIndex = 327;      
        while (counter < textWantedCharArray.length){
            for(int i = startingIndex; i < textWanted.length() + startingIndex; i++){
                boxCharArray[i] = textWantedCharArray[counter];
                counter++;
            }
        }   
        box = new String(boxCharArray);
    }

    public String redrawTextBox(){
        computeTextInsert(box);
        return box;
    }
}
