import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Test class for Enhanced Unit class
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
     * tests for set Special Rule
     */
    public void testSetSpecialRule()
    {
        EnhancedUnit jim = new EnhancedUnit("jim", 1);
        jim.setSpecialRule("no block");
        
        assertThat(jim.getSpecialRule()).isEqualTo("no block");
    }
    /**
     * tests constructors
     */
    public void testContstructor()
    {
        EnhancedUnit jim = new EnhancedUnit("jim", 1);

        assertThat(jim.getSpecialRule()).isEqualTo(null);
        assertThat(jim.getPoints()).isEqualTo(1);
        assertThat(jim.getName()).isEqualTo("jim");
    }
    /**
     * testing the toString method
     */
    public void testToString()
    {
        EnhancedUnit jim = new EnhancedUnit("jim", 1);
        
        jim.setSpecialRule("jumps");
        
        assertThat(jim.toString()).
            isEqualTo("jim (1, 2, 2) special rule:jumps");
        
        EnhancedUnit rob = new EnhancedUnit("jim", 1);
    
        assertThat(rob.toString()).
            isEqualTo("jim (1, 2, 2)");
    }
}
