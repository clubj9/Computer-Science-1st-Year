
//-------------------------------------------------------------------------
/**
 *  A Hero is a subclass of EnhancedUnit that is extra durable and capable. 
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Hero
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param n name
     * @param p points
     */
    public Hero(String n, int p)
    {
        super(n, p);
        setQuality(5);
        setDefense(5);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


}
