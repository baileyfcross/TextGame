
/**
 * Person is a Person.
 *
 * Class is Immutable
 *
 * @author (Bailey Cross)
 * @version (1)
 */
public class Person
{
    //instance variables
    private int health;
    private int damage;
    private int agility;
    private int handSlots;
    
    /**
     * Constructor for objects of class Person
     * 
     * All of these are the baseline for all Person extenders as well.
     * 
     * H, D, A, HS
     */
    public Person()
    {
        health = 100;
        damage = 30;
        agility = 20;
        handSlots = 2;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getAgility(){
        return agility;
    }
    
    public int getHandSlots(){
        return handSlots;
    }
}
