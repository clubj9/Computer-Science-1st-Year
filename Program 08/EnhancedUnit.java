
//-------------------------------------------------------------------------
/**
 *   EnhancedUnit is a subclass of Unit that supports storing this information.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class EnhancedUnit
    extends Unit
{
    //~ Fields ................................................................
    private String specialRule;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created EnhancedUnit object.
     * @param n its name
     * @param p points
     */
    public EnhancedUnit(String n, int p)
    {
        super(n, p);
        specialRule = null;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * setter method for special Rule
     * @param rule the special rule
     */
    public void setSpecialRule(String rule)
    {
        specialRule = rule;
    }
    /**
     * getter method for special Rule
     * @return the special rule
     */
    public String getSpecialRule()
    {
        return specialRule;
    }
    /**
     * method for return the upgrades name and points
     * @return the string
     */
    public String toString()
    {
        if (specialRule == null)
        {
            return super.toString();
        }
        return super.toString() + " special rule:" + specialRule;
    }
}
