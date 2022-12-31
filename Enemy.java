
/**
 * The guy who drops gold
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class Enemy extends Person
{
    private int health;
    private int damage;
    private int agility;
    private int handSlots;
    
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy()
    {
        health = super.getHealth();
        damage = super.getDamage();
        agility = super.getAgility();
        handSlots = super.getHandSlots();
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
}
