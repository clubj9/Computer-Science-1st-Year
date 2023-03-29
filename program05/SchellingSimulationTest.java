// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis-King (jadendk)
import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.media.*;
import java.awt.Color;
import student.util.Random;

// -------------------------------------------------------------------------
/**
 *  Testing Class for the Schelling Simulation Class
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.02.28)
 */
public class SchellingSimulationTest
    extends TestCase
{
    //~ Fields ................................................................
    private double satisfactionThreshold;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SchellingSimulationTest test object.
     */
    public SchellingSimulationTest()
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
     * test calls for getSatisfacitonThreshold
     */
    public void testGetSatisfactionThreshold()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        simulation.setSatisfactionThreshold(4.0);

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.getSatisfactionThreshold()).isEqualTo(4.0);
    }
    /**
     * test the method getRedLine
     */
    public void testGetRedLine()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        simulation.setRedLine(5);

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.getRedLine()).isEqualTo(5);
    }
    /**
     * tests the method populate
     */
    public void testPopulate()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        simulation.populate(1.5, 1.5);

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        Random generator = Random.generator();
        int value = generator.nextInt(100);
        for (Pixel pix: simulation.getPixels())
        {
            if (value < 1.5)
            {
                assertThat(pix.getColor()).isEqualTo(Color.BLUE);
            }
        }
        for (Pixel pix: simulation.getPixels())
        {
            if (value < 1.5)
            {
                assertThat(pix.getColor()).isEqualTo(Color.BLUE);
            }
        }
    }
    /**
     * tests the method areSameColor
     */
    public void testAreSameColor()
    {
        SchellingSimulation simulation = new SchellingSimulation(4, 4);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
        Pixel p1 = simulation.getPixel(1,1);
        Pixel p2 = simulation.getPixel(1,2);
        p1.setColor(Color.BLUE);
        p2.setColor(Color.BLUE);
        // I want maybeRelocate() to choose (1, 1) as the destination
        boolean equalColor = simulation.areSameColor(p1,p2);
        

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.areSameColor(p1,p2)).isEqualTo(false);
        assertThat(simulation.getPixel(0, 0).getColor()).isEqualTo(Color.WHITE);
        assertThat(simulation.getPixel(1, 1).getColor()).isEqualTo(Color.BLUE);
    }
    /**
     * tests the method isEmpty
     */
    public void testIsEmpty()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        boolean empty = simulation.isEmpty(simulation.getPixel(1, 1));

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.isEmpty(simulation.getPixel(1, 1))).isFalse();
        assertThat(simulation.getPixel(0, 0).getColor()).isEqualTo(Color.WHITE);
    }
    /**
     * tests the method isSatisfied
     */ 
    public void testIsSatisfied()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        //simulation.isSatisfied(simulation.getPixel(1, 1), Color.BLUE);

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.
            isSatisfied(simulation.getPixel(1, 1), Color.BLUE)).isFalse();
        assertThat(simulation.getPixel(0, 0).getColor()).isEqualTo(Color.WHITE);
    }
    /**
     * tests the method maybeRelocate
     */
    public void testMaybeRelocate()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 3);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
        Pixel pix = simulation.getPixel(1, 1);
        Pixel pix2 = simulation.getPixel(1, 2);
        pix.setColor(Color.WHITE);
        pix2.setColor(Color.ORANGE);
        // I want maybeRelocate() to choose (1, 1) as the destination
        //simulation.maybeRelocate(pix);
        //simulation.maybeRelocate(pix2);
        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.maybeRelocate(pix)).isFalse();
        assertThat(simulation.maybeRelocate(pix2)).isFalse();;
    }
    /**
     * tests the method cycleAgents
     */
    public void testCycleAgents()
    {
        SchellingSimulation simulation = new SchellingSimulation(2, 2);
        // Initial setup creates a 2x2 simulation
        // a blue agent is at (0, 0)
    
        // I want maybeRelocate() to choose (1, 1) as the destination
        simulation.cycleAgents();

        // Assume (1, 1) is what it really selected, and write expectations
        // for that
        assertThat(simulation.cycleAgents()).isEqualTo(4);
        assertThat(simulation.getPixel(0, 0).getColor()).isEqualTo(Color.WHITE);
    }
}
