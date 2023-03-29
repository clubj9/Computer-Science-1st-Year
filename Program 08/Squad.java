import java.util.List;
import java.util.ArrayList;

//-------------------------------------------------------------------------
/**
 *  group of units that work together, kind of like a larger unit 
 *  composed of multiple characters/pieces
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Squad
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param n name
     */
    public Squad(String n)
    {
        super(n, 0);
        units = new ArrayList<Unit>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * getter method for Units
     * @return the list
     */
    public List<Unit> getUnits()
    {
        return units;
    }
    /**
     * add method for Units
     * @param unit unit
     */
    public void addUnit(Unit unit)
    {
        units.add(unit);
    }
    /**
     * remove method for Units
     * @param unit unit
     */
    public void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
    /**
     * getter method for points
     * @return points
     */
    public int getPoints()
    {
        int upPoints = 0;
        for (Unit up : units)
        {
            upPoints += up.getPoints();
        }
        return super.getPoints() + upPoints;
    }
    /**
     * method for return the upgrades name and points
     * @return the string
     */
    public String toString()
    {
        String newString = "";
        for (Unit u : units)
        {
            newString += u.toString();
            newString += ", ";
        }
        return super.toString() + " units: " + units;
    }
}
