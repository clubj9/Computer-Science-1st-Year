
//-------------------------------------------------------------------------
/**
 *  army consists of a series of squads and larger 
 *  units (monsters, heroes, etc.)
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class Army
    extends Squad
{
    //~ Fields ................................................................
    private String playerName;
    private String faction;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Army object.
     * @param aName the army name
     * @param fact faction name
     * @param pName player name
     */
    public Army(String aName, String fact, String pName)
    {
        super(aName);
        playerName = pName;
        faction = fact;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * getter method for player name
     * @return the string
     */
    public String getPlayerName()
    {
        return playerName;
    }
    /**
     * setter method for player name
     * @param s name
     */
    public void setPlayerName(String s)
    {
        playerName = s;
    }
    /**
     * getter method for faction
     * @return the string
     */
    public String getFaction()
    {
        return faction;
    }
    /**
     * setter method for faction
     * @param s faction
     */
    public void setFaction(String s)
    {
        faction = s;
    }
    /**
     * returns to string values for each unit
     * @return the string
     */
    public String toString()
    {
        return "player: " + playerName + ", faction:" + faction 
            + ", army:" + super.toString(); 
    }
}
