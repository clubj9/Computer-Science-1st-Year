import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Test class for Monster Class
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class MonsterTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MonsterTest test object.
     */
    public MonsterTest()
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
     * tests constructors
     */
    public void testContstructor()
    {
        Monster jim = new Monster("jim", 1);
        
        assertThat(jim.getName()).isEqualTo("jim");
        assertThat(jim.getPoints()).isEqualTo(1);
        assertThat(jim.getDefense()).isEqualTo(4);
        assertThat(jim.getQuality()).isEqualTo(4);
    }
}
