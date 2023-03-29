import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Test class for the upgrade class
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
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
     * tests for getting and setting cost
     */
    public void testGetPoints()
    {
        Upgrade jim = new Upgrade("jim", 1);
        jim.setPoints(2);
        
        assertThat(jim.getPoints()).isEqualTo(2);
    }
    /**
     * tests for getting and setting name
     */
    public void testGetName()
    {
        Upgrade jim = new Upgrade("jim", 1);
        jim.setName("jee");
        
        assertThat(jim.getName()).isEqualTo("jee");
    }
    /**
     * tests constructors
     */
    public void testContstructor()
    {
        Upgrade jim = new Upgrade("jim", 1);
        
        assertThat(jim.getName()).isEqualTo("jim");
        assertThat(jim.getPoints()).isEqualTo(1);
    }
    /**
     * testing the toString method
     */
    public void testToString()
    {
        Upgrade jim = new Upgrade("jim", 1);
        
        assertThat(jim.toString()).isEqualTo("jim (1)");
    }
}
