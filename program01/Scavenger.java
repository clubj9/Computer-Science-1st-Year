
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis-King (jadendk)
/**
 * The Scavenger class inherits all the methods from the jeroo class
 * and also has several other methods to help it navigate the Scavenger
 * Hunt easier.
 *
 *  @author Jaden Davis-King
 *  @version 2023.01.31
 */
public class Scavenger
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Scavenger object.
     */
    public Scavenger()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Scavenger will hop forward twice.
     */    
    public void hopTwice()
    {
        
        //Scavenger will hop forward twice.
         
        this.hop();
        this.hop();
    }
    /**
     * Scavenger rotates to the right twice to do a full 180.
     */
    public void turnAround()
    {
        
        //Scavenger rotates to the right twice to do a full 180.
        
        this.turn(RIGHT);
        this.turn(RIGHT);
    }
    /**
     * Scanger avoids the nets to navigate to the first flower.
     */
    public void navigateFlowerOne()
    {
        
        //Scanger avoids the nets to navigate to the first flower.
        
        this.hopTwice();
        this.turn(RIGHT);
        this.hopTwice();
        this.turn(LEFT);
        this.hopTwice();
        this.turn(LEFT);
        this.hopTwice();
        this.hop();
        this.pick();
    }
    /**
     * Scavenger turns right and hops to the flower adjacent to 
     * the first one and picks it.
     */
    public void navigateFlowerTwo()
    {
        
        //Scavenger turns right and hops to the flower adjacent to 
        //the first one and picks it.
        
        this.turn(RIGHT);
        this.hopTwice();
        this.hop();
        this.pick();
    }
    /**
     * Scavenger continues forward to collect the next adjacent
     * flower and picks it.
     */
    public void navigateFlowerThree()
    {
        
        //Scavenger continues forward to collect the next adjacent
        //flower and picks it.
        
        this.hopTwice();
        this.hopTwice();
        this.pick();
    }
    /**
     * Scavenger travels down on the map and turns to its right 
     * to collect the next flower and picks the flower.
     */
    public void navigateFlowerFour()
    {
        
        //Scavenger travels down on the map and turns to its right 
        //to collect the next flower and picks the flower.
        
        this.turn(RIGHT);
        this.hopTwice();
        this.hopTwice();
        this.hopTwice();
        this.hopTwice();
        this.turn(RIGHT);
        this.hop();
        this.pick();
    }
    /**
     * Scavenger will call the 'turnAround' method to and hop 
     * twice to collect the next flower.
     */
    public void navigateFlowerFive()
    {
        //Scavenger will call the 'turnAround' method to and hop 
        //twice to collect the next flower.
        this.turnAround();
        this.hopTwice();
        this.pick();
    }
    /**
    * Scavenger will turn around once again to navigate left
    * 5 spaces and pcik the flower.
    */
    public void navigateFlowerSix()
    {
        
        //Scavenger will turn around once again to navigate left
        //5 spaces and pcik the flower.
         
        this.turnAround();
        this.hopTwice();
        this.hopTwice();
        this.hop();
        this.pick();
    }
    /**
    * Scavenger will turn right, hop, turn left, hop twice, 
    * turn left once again, then finally hop to the flower 
    * and collect it.
    */
    public void navigateFlowerSeven()
    {
        
        //Scavenger will turn right, hop, turn left, hop twice, 
        //turn left once again, then finally hop to the flower 
        //and collect it.
         
        this.turn(RIGHT);
        this.hop();
        this.turn(LEFT);
        this.hopTwice();
        this.turn(LEFT);
        this.hop();
        this.pick();
    }
    /**
         * Scavenger will turn around, hop forward, then turn right
         * to begin navigating in an L shape to the final flower in
         * the center of the island.
    */
    public void navigateFinalFlower()
    {
        //Scavenger will turn around, hop forward, then turn right
        //to begin navigating in an L shape to the final flower in
        //the center of the island.
        this.turnAround();
        this.hop();
        this.turn(RIGHT);
        this.hopTwice();
        this.hop();
        this.turn(LEFT);
        this.hopTwice();
        this.hop();
        this.pick();
        this.turn(RIGHT);
    }
    /**
    * Calls each method to navigate to a different flower and
    * pick it.
    */
    public void collectFlowers()
    {
        
        //Calls each method to navigate to a different flower and
        //pick it.
        
        this.navigateFlowerOne();
        this.navigateFlowerTwo();
        this.navigateFlowerThree();
        this.navigateFlowerFour();
        this.navigateFlowerFive();
        this.navigateFlowerSix();
        this.navigateFlowerSeven();
        this.navigateFinalFlower();
        
    }

}
