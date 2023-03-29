import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

// -------------------------------------------------------------------------
/**
 *  Test class for the Squad class.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
     * testing the toString method
     */
    public void testToString()
    {
        Squad jim = new Squad("jim");
        Unit jace = new Unit("jim", 1);
        
        jim.addUnit(jace);
        jim.addUnit(jace);
        
        assertThat(jim.toString()).
            isEqualTo("jim (0, 2, 2)" + 
                " units: [jim (1, 2, 2), jim (1, 2, 2)]");
    }
    /**
     * testing the addition of units
     */
    public void testAddUnit()
    {
        Squad jim = new Squad("jim");
        Unit jace = new Unit("jim", 1);
        
        jim.addUnit(jace);
        List<Unit> array = jim.getUnits();
        
        
        assertThat(jim.getUnits()).isEqualTo(array);
    }
    /**
     * testing the removal of units
     */
    public void testRemoveUnits()
    {
        Squad jim = new Squad("jim");
        Unit jace = new Unit("jim", 1);
        
        jim.addUnit(jace);
        jim.removeUnit(jace);
        List<Unit> array = jim.getUnits();
        
        
        assertThat(jim.getUnits()).isEqualTo(array);
    }
    /**
     * testing the getPoints Method
     */
    public void testGetPoints()
    {
        Squad jim = new Squad("jim");
        Unit strength = new Unit("strength", 1);
        jim.setPoints(2);
        jim.addUnit(strength);
        jim.addUnit(strength);
        jim.addUnit(strength);
        
        assertThat(jim.getPoints()).isEqualTo(5);
    }
}
