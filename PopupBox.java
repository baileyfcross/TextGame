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
    private char[] textWantedCharArray;
    private char[] boxCharArray;
    
    /**
     * Constructor for objects of class PopupBox
     */
    public PopupBox(String newValue)
    {       
        textWanted = newValue;
    }
    
    private void nextLine(String boxIn, int counter){
        int tempStartingIndex = startingIndex + 52;
        int initalCounterLevel = counter;
        int countingIndex = counter;
        while (countingIndex < textWantedCharArray.length){
            for(int j = tempStartingIndex; j < (textWanted.length() - initalCounterLevel) + tempStartingIndex; j++){
                boxCharArray[j] = textWantedCharArray[countingIndex];
                countingIndex++;
            }            
        } 
    }
    
    /***
     * Starting Index = 325 (0)
     * Middle Index = 351 (26)
     * Ending Index = 377 (52)
     */
    private void computeTextInsert(String box){
        textWantedCharArray = textWanted.toCharArray();
        boxCharArray = box.toCharArray();
        int counter = 0;
        startingIndex = 327;      
        while (counter < textWantedCharArray.length){
            for(int i = startingIndex; i < textWanted.length() + startingIndex; i++){
                if(boxCharArray[i] == ('+')){
                    i++;
                    boxCharArray[i] = '\n';
                    nextLine(box,counter);
                    break;
                }
                boxCharArray[i] = textWantedCharArray[counter];
                counter++;
            }            
        }   
        this.box = new String(boxCharArray);
    }
    
    

    public String redrawTextBox(){
        computeTextInsert(this.box);
        return this.box;
    }
}
