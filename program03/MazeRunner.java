
import student.micro.jeroo.*;
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis- King(jadendk)
//-------------------------------------------------------------------------
/**
 *  Jeroo meant to navigate a maze
 *  
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.02.14)
 */
public class MazeRunner
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeRunner object.
     */
    public MazeRunner()
    {
        super(10);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * moves through the maze
     */
    public void clearMaze()
    {
        getThrough();
        turnSouth();
        getThrough();
    }
    /**
     * gets through a branch
     */
    public void getThrough()
    {
        checkSafe();
        if (!seesWater(AHEAD))
        {
            this.hop();
            while (!getStarted())
            {
                move();
            }
            
        }
    }
    /**
     * Should complete maze and end at starting point
     */
    public void move()
    {
        if ( !seesWater(RIGHT))
        {
            turn(RIGHT);
            hop();
        }
        else if (!seesWater(AHEAD))
        {
            hop();
        }
        else if (!seesWater(LEFT))
        {
            turn(LEFT);
            hop();
        }
        else
        {
            turn(RIGHT);
            turn(RIGHT);
        }
    }
    /**
     * Checks to see if there is a flower ahead. picks flower if there is one
     */
    public void checkSafe()
    {   
        if (seesFlower(HERE))
        {
            this.pick();
        }
        if (seesNet(AHEAD))
        {
            toss();
        }
    }
    /**
     * Moves jeroo away from its starting position
     * @return true if the jeroo is at the start
     */
    public boolean getStarted()
    {
        return (getX() == 1 && getY() == 1);
    }
    /**
     * turns south
     */
    public void turnSouth()
    {
        while (getHeading() != SOUTH)
        {
            turn(LEFT);
        }
    }
    /**
     * hops safely
     */
    public void hop()
    {
        if (this.seesNet(AHEAD) )
        {
            this.toss();
        }
        if (seesFlower(HERE))
        {
            this.pick();
        }
        super.hop();
    }
}   


