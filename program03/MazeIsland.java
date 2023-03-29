import student.micro.jeroo.*;
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis- King(jadendk)
//-------------------------------------------------------------------------
/**
 *  An island with a randomly generated maze layout.
 *
 *  @author Stephen Edwards
 *  @version 2021.09.12
 */
public class MazeIsland
    extends MazeIslandBase
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeIsland object with a random
     * width, height, and maze layout.
     */
    public MazeIsland()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeIsland object with the
     * specified size and a random maze layout.
     * 
     * @param width The desired world width
     * @param height The desired world height
     */
    public MazeIsland(int width, int height)
    {
        super(width, height);
    }


    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeIsland object identified by the specified
     * id number, so you can create the same island over and over
     * with the exact same layout.
     * 
     * @param width  The desired world width
     * @param height The desired world height
     * @param id     The id of the random layout to use
     *               (unique for every size)
     */
    public MazeIsland(int width, int height, long id)
    {
        super(width, height, id);
    }


    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeIsland object with the
     * specified size and maze layout identified by the specified
     * id number. Any unique id number will generate a specific
     * island dimensions and layout, so the same island can be
     * recreated whenever desired.
     * 
     * @param id The id of the random layout to use
     *           (unique for every size)
     */
    public MazeIsland(long id)
    {
        super(id);
    }
    /**
     * the myProgram method
     */
    public void myProgram()
    {
        MazeRunner stef = new MazeRunner();
        this.addObject(stef, 1, 1);
        stef.clearMaze();
        
        
    }
}