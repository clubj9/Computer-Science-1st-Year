
//-------------------------------------------------------------------------
/**
 *  These are "upgrades", usually boosting the unit's abilities in 
 *  some interesting way.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Upgrade
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param n name
     * @param p points
     */
    public Upgrade(String n, int p)
    {
        super();
        name = n;
        points = p;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * setter method for the points
     * @param val value for points
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
        return points;
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
     * method for return the upgrades name and points
     * @return the string
     */
    public String toString()
    {
        return name + " (" + points + ")";
    }
}
