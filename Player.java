
/**
 * The Main Guy
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class Player extends Person
{
    private int gold;
    private int health;
    private int damage;
    private int agility;
    private int handSlots;
    
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        health = super.getHealth();
        damage = super.getDamage();
        agility = super.getAgility();
        handSlots = super.getHandSlots();
        gold = 10;
    }
    
    /***
     * Health
     */
    public void setHealth(int newValue){
        health = newValue;
    }
    public int getHealth(){
        return health;
    }
    
    /***
     * Damage
     */
    public void setDamage(int newValue){
            damage = newValue;
    } 
    public int getDamage(){
        return damage;
    }
    
    /***
     * Agility
     */
    public void setAgility(int newValue){
        agility = newValue;
    }
    public int getAgility(){
        return agility;
    }
    
    /***
     * Number of weapon slots available 
     */
    public void setHandSlots(int newValue){
        handSlots = newValue;
    }
    public int getHandslots(){
        return handSlots;
    }

    
    /***
     * Gold is Unique for the Player
     */
    public void setGold(int newValue){
        gold = newValue;
    }
    public int getGold(){
        return gold;
    }  
}
