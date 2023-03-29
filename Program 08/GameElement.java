
//-------------------------------------------------------------------------
/**
 *  This interface requires that any class that implements it must provide 
 *  getter methods to return the name and number of points associated with the 
 *  object.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public interface GameElement
{
    //~ Methods ...............................................................
      // ----------------------------------------------------------
    /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName();


    // ----------------------------------------------------------
    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints();
    // ----------------------------------------------------------
}
