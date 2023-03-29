import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Test class for the Army class.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class ArmyTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ArmyTest test object.
     */
    public ArmyTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * testing getting the player name
     */
    public void testPlayerName()
    {
        Army jim = new Army("Them", "ATL", "me");
        jim.setPlayerName("tim");
        
        assertThat(jim.getPlayerName()).isEqualTo("tim");
    }
    /**
     * testing the constructor
     */
    public void testConstructor()
    {
        Army jim = new Army("Them", "ATL", "me");
        
        assertThat(jim.getPlayerName()).isEqualTo("me");
        assertThat(jim.getFaction()).isEqualTo("ATL");
    }
    /**
     * testing the toString method
     */
    public void testToString()
    {
        Army jim = new Army("Them", "ATL", "me");
        
        assertThat(jim.toString()).
            isEqualTo("player: me, faction:ATL," + 
                " army:Them (0, 2, 2) units: []");
    }
    /**
     * test the getFaction
     */
    public void testGetFaction()
    {
        Army jim = new Army("Them", "ATL", "me");
        jim.setFaction("tim");
        
        assertThat(jim.getFaction()).isEqualTo("tim");
    }
}