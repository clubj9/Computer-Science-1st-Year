
import student.micro.jeroo.*;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis-King (jadendk)
//-------------------------------------------------------------------------
/**
 *  The ScangerHunt class is created to add an a Scavenger object 
 *  into the Island and call it's methods.
 *
 *  @author Jaden Davis-King
 *  @version 2023.01.31
 */
public class ScavengerHunt
    extends LongIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        super();
    }


    //~ Methods ...............................................................
    /**
     * An instance of the Scavenger class is added and its 
     * method is called
     */
    public void myProgram()
    {
        Scavenger joe = new Scavenger();
        this.addObject(joe, 1, 2);
        joe.collectFlowers();
    }
}
