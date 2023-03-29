
//-------------------------------------------------------------------------
/**
 *  A Monster is another subclass of EnhancedUnit that is extra durable and 
 *  capable
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Monster
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param n name
     * @param p points
     */
    public Monster(String n, int p)
    {
        super(n, p);
        setQuality(4);
        setDefense(4);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


}
