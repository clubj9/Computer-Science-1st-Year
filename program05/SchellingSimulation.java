// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Jaden Davis-King (jadendk)
import student.media.*;
import java.awt.Color;
import student.util.Random;

//-------------------------------------------------------------------------
/**
 *  represents an image that will model the neighborhood, with 
 *  each pixel representing a location that is either occupied or 
 *  empty.
 *
 *  @author Jaden Davis-King (jadendk)
 *  @version (2023.02.27)
 */
public class SchellingSimulation
    extends Picture
{
    //~ Fields ................................................................
    private double satisfactionThreshold;
    private int redLine;
    private int w;
    private int h;
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SchellingSimulation object.
     * @param width amount of pixels in the x direction
     * @param height pixels in the y direction
     */
    public SchellingSimulation(int width, int height)
    {
        super(width, height);
        satisfactionThreshold = 0.3;
        redLine = 0;
        w = width;
        h = height;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * A getter method that returns the satisfaction threshold 
     * (a double).
     * @return the satisfaction threshold
     */
    public double getSatisfactionThreshold()
    {
        return satisfactionThreshold;
    }
    /**
     * A setter method that takes a double parameter and changes 
     * the satisfaction threshold to the specified value.
     * @param satisfaction sets satisfaction
     */
    public void setSatisfactionThreshold(double satisfaction)
    {
        satisfactionThreshold = satisfaction;
    }
    /**
     * A getter method that returns the redline value 
     * make a integer later
     * @return the redLine value
     */
    public int getRedLine()
    {
        return redLine;
    }
    /**
     *     A setter method that takes an integer parameter and changes
     *     the redline to the specified value.
     *     @param value changes redline value
     */
    public void setRedLine(int value)
    {
        redLine = value;
    }
    /**
     * This methods Paints the image with a randomized collection
     * of blue and orange pixels
     * @param blue represets X agent
     * @param orange representing an O agent
     */
    public void populate(double blue, double orange)
    {
        Random generator = Random.generator();
        int value = generator.nextInt(100);
        for (Pixel pix: getPixels())
        {
            if (value < blue)
            {
                pix.setColor(Color.BLUE);
            }
        }
        for (Pixel pix: getPixels())
        {
            if (value < orange)
            {
                pix.setColor(Color.ORANGE);
            }
        }
    }
    /**
     * Takes two pixel objects and returns a boolean value indicating
     * whether the two pixels have the same color
     * @param val a pixel
     * @param val2 a pixel
     * @return true if the two pixels have the same color
     */
    public boolean areSameColor(Pixel val, Pixel val2)
    {
        return (val.getColor() == val2.getColor());
    }
    /**
     * Takes one pixel obect and returns true if its color is white,
     * representing an empty location
     * @param pixel a pixel
     * @return true if the location is empty
     */
    public boolean isEmpty(Pixel pixel)
    {

        return (pixel.getColor() == Color.WHITE);
    }
    /**
     * returns a boolean idication whether an angent of a certain 
     * color will be satisfied at a given location
     * @param p a pixel
     * @param color a color
     * @return true if the agent of the specified color would be 
     * satisfied at the given location
     */
    public boolean isSatisfied(Pixel p, Color color)
    {
        double agentCount = 0;
        double sameAgents = 0;
        for (Pixel neighbor : p.getNeighborPixels())
        {
            if (neighbor.getColor() == Color.WHITE)
            {
                return true;
            }
            else if (neighbor.getColor() == color)
            {
                agentCount++;
                sameAgents++;
            }
            else 
            {
                agentCount++;
            }
            
        }
        double ratio = sameAgents / agentCount;
        return (ratio >= satisfactionThreshold);
    }
    /**
     * tries to move the corresponding agent to a new pixel
     * location
     * @param pixel a pixel
     * @return returns true if the agent is moved
     */
    public boolean maybeRelocate(Pixel pixel)
    {
        Random generator = Random.generator();
        int x = generator.nextInt(w);
        int y = 0;
        if (pixel.getColor() == Color.WHITE)
        {
            y = generator.nextInt(redLine);
        }
        else
        {
            y = generator.nextInt(h);
        }
        if (isEmpty(pixel) && isSatisfied(pixel, pixel.getColor()))
        {
            Pixel pics = getPixel(x, y);
            pics.setColor(pixel.getColor());
            pixel.setColor(Color.WHITE);
            return true;
        }
        return false;
    }
    /**
     * Uses a loop to check each pixel if its open
     * make a int later
     * @return total number of successful moves after processing
     * all pixels
     */
    public int cycleAgents()
    {
        int number = 0;
        for (Pixel pix : getPixels())
        {
            if (!(isEmpty(pix) && isSatisfied(pix, pix.getColor())))
            {
                if (!maybeRelocate(pix))
                {
                    number++;
                }
            }
        }
        return number;
    }
}   


