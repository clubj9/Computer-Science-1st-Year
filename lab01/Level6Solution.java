import student.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Level 6, together with its solution using a single Light-Bot.
 *
 * @author Jaden Davis-King (jadendk)
 * @version 2023.1.24
 */
public class Level6Solution
    extends Level6
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Thw method myProgram creates a LightBot named andy and moves it through a 
     * course of obstacles, turning the blue tiles "on".
     */
    public void myProgram()
    { 
    
        LightBot andy = new LightBot();
        this.addObject(andy, 2, 6);
        andy.turnLeft();
        andy.move();
        andy.jump();
        andy.jump();
        andy.turnRight();
        andy.jump();
        andy.jump();
        andy.turnLightOn();
        andy.jump();
        andy.turnRight();
        andy.move();
        andy.move();
        andy.move();
        andy.turnLightOn();
        andy.turnRight();
        andy.turnRight();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.turnLightOn();
    }
}
