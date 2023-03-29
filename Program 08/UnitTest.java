import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

// -------------------------------------------------------------------------
/**
 *  Test class for the Unit class.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.03.20)
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
        Unit jim = new Unit("jim", 1);
        Upgrade strength = new Upgrade("strength", 3);
        
        jim.addUpgrade(strength);
        jim.addUpgrade(strength);
        jim.addUpgrade(strength);
        jim.setPoints(2);
        
        
        assertThat(jim.getPoints()).isEqualTo(11);
    }
    /**
     * tests for getting and setting name
     */
    public void testGetName()
    {
        Unit jim = new Unit("jim", 1);
        jim.setName("jee");
        
        assertThat(jim.getName()).isEqualTo("jee");
    }
    /**
     * tests for getting and setting cost
     */
    public void testGetQuality()
    {
        Unit jim = new Unit("jim", 1);
        jim.setQuality(3);
        
        assertThat(jim.getQuality()).isEqualTo(3);
    }
    /**
     * tests for getting and setting name
     */
    public void testGetDefense()
    {
        Unit jim = new Unit("jim", 1);
        jim.setDefense(1);
        
        assertThat(jim.getDefense()).isEqualTo(1);
    }
    /**
     * tests constructors
     */
    public void testContstructor()
    {
        Unit jim = new Unit("jim", 1);
        
        assertThat(jim.getName()).isEqualTo("jim");
        assertThat(jim.getPoints()).isEqualTo(1);
        assertThat(jim.getDefense()).isEqualTo(2);
        assertThat(jim.getQuality()).isEqualTo(2);
    }
    /**
     * testing the toString method
     */
    public void testToString()
    {
        Unit jim = new Unit("jim", 1);
        Upgrade strength = new Upgrade("strength", 3);
        
        jim.addUpgrade(strength);
        
        assertThat(jim.toString()).
            isEqualTo("jim (1, 2, 2) upgrades:[strength (3)]");
    }
    /**
     * testing the addition of upgrades
     */
    public void testAddUpgrades()
    {
        Unit jim = new Unit("jim", 1);
        Upgrade strength = new Upgrade("strength", 3);
        
        jim.addUpgrade(strength);
        List<Upgrade> array = jim.getUpgrades();
        
        
        assertThat(jim.getUpgrades()).isEqualTo(array);
    }
    /**
     * testing the removal of upgrades
     */
    public void testRemoveUpgrades()
    {
        Unit jim = new Unit("jim", 1);
        Upgrade strength = new Upgrade("strength", 3);
        
        jim.addUpgrade(strength);
        jim.removeUpgrade(strength);
        List<Upgrade> array = jim.getUpgrades();
        
        
        assertThat(jim.getUpgrades()).isEqualTo(array);
    }
    
}
