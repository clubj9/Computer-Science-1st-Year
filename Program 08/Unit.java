import java.util.List;
import java.util.ArrayList;

//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis-King (jadendk)
/**
 *  This class represents any kind of playable unit in the game, and will 
 *  define the features that all units have in common.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Unit
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;
    private int quality;
    private int defense;
    private List<Upgrade> upgrades;
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Unit object.
     * @param n name
     * @param p points
     */
    public Unit(String n, int p)
    {
        super();
        name = n;
        points = p;
        quality = 2;
        defense = 2;
        upgrades = new ArrayList<Upgrade>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * setter method for points
     * @param val points value
     */
    public void setPoints(int val)
    {
        points = val;
    }
    /**
     * getter method for points
     * @return the value
     */

    public int getPoints()
    {
        int nPoints = 0;
        for (Upgrade up : upgrades)
        {
            nPoints += up.getPoints();
        }
        return points + nPoints;
    }
    /**
     * setter method for name
     * @param str set the name
     */
    public void setName(String str)
    {
        name = str;
    }
    /**
     * getter method for name
     * @return the value
     */
    public String getName()
    {
        return name;
    }
    /**
     * setter method for quality
     * @param q set quality value
     */
    public void setQuality(int q)
    {
        quality = q;
    }
    /**
     * getter method for quality
     * @return the value
     */
    public int getQuality()
    {
        return quality;
    }
    /**
     * setter method for defense
     * @param d set Defense value
     */
    public void setDefense(int d)
    {
        defense = d;
    }
    /**
     * getter method for defense
     * @return the value
     */
    public int getDefense()
    {
        return defense;
    }
    /**
     * getter method for upgrades
     * @return the value
     */
    public List<Upgrade> getUpgrades()
    {
        return upgrades;
    }
    /**
     * add method for upgrades
     * @param up Upgrade
     */
    public void addUpgrade(Upgrade up)
    {
        upgrades.add(up);
    }
    /**
     * remove method for upgrades
     * @param up upgrade
     */
    public void removeUpgrade(Upgrade up)
    {
        upgrades.remove(up);
    }
    /**
     * method for return the upgrades name and points
     * @return the string
     */
    public String toString()
    {
        if (upgrades.isEmpty())
        {
            return name + " (" + points + ", " + quality + ", " + 
                defense + ")";
        }
        return name + " (" + points + ", " + quality + ", " + 
            defense + ")" + " upgrades:" + upgrades;
    }
}
