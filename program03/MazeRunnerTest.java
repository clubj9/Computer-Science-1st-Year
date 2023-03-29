import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;


// -------------------------------------------------------------------------
/**
 *  Test Class for MazeRunnerClass
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.02.21)
 */
public class MazeRunnerTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunnerTest test object.
     */
    public MazeRunnerTest()
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
     * test for clearing the maze
     */
    public void testClearMaze()
    {
        MazeIsland island = new MazeIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1 ,1 );
        
        joe.clearMaze();
        
        assertThat(joe.getY()).isEqualTo(1);
        assertThat(joe.getX()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(0);
    }
    /**
     * test for the method getThrough
     */
    public void testGetThrough()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1 , 1 );
        island.addObject(new Net(), 2, 1);
        island.addObject(new Flower(), 1, 1);
        
        joe.getThrough();
        
        assertThat(joe.getY()).isEqualTo(1);
        assertThat(joe.getX()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(0);
        assertThat(island.countNets()).isEqualTo(0);
    }
    /**
     * test for the method move
     */
    public void testMove()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        MazeRunner trey = new MazeRunner();
        MazeRunner irene = new MazeRunner();
        MazeRunner ere = new MazeRunner();
        island.addObject(joe, 1 , 1 );
        island.addObject(trey, 10 , 7 );
        island.addObject(irene, 8 , 7 );
        island.addObject(ere, 5 , 5 );
        
        joe.move();
        trey.move();
        irene.move();
        ere.move();
        
        assertThat(joe.getY()).isEqualTo(2);
        assertThat(joe.getX()).isEqualTo(1);
        assertThat(trey.getY()).isEqualTo(7);
        assertThat(trey.getX()).isEqualTo(10);
        assertThat(irene.getY()).isEqualTo(7);
        assertThat(irene.getX()).isEqualTo(9);
        assertThat(ere.getY()).isEqualTo(4);
        assertThat(ere.getX()).isEqualTo(5);
    
        
        
        
    }
    /**
     * test for the method checkSafe
     */
    public void testCheckSafe()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1, 1);
        island.addObject(new Net(), 2, 1);
        island.addObject(new Flower(), 1, 1);
        
        joe.checkSafe();
        
        assertThat(joe.hasFlower()).isEqualTo(true);
        assertThat(island.countNets()).isEqualTo(0);
    }
    /**
     * test for the boolean getStarted
     */
    public void testgetStarted()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1, 1);
        
        boolean position = joe.getStarted();
        
        assertThat(position).isEqualTo(true);
        
    }
    /**
     * test for the method turnSouth
     */
    public void testTurnSouth()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1, 1);
        
        joe.turnSouth();
        
        assertThat(joe.isFacing(SOUTH)).isEqualTo(true);
    }
    /**
     * test for the method hop
     */
    public void testHop()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner joe = new MazeRunner();
        island.addObject(joe, 1, 1);
        island.addObject(new Net(), 2, 1);
        island.addObject(new Flower(), 1, 1);
        
        joe.hop();
        
        assertThat(joe.hasFlower()).isEqualTo(true);
        assertThat(island.countNets()).isEqualTo(0);
        assertThat(joe.getY()).isEqualTo(1);
        assertThat(joe.getX()).isEqualTo(2);
    }
}
