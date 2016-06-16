import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yacht here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class yacht extends Actor
{
    /**
     * Act - do whatever the yacht wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setRotation(Greenfoot.getRandomNumber(360));
        move(3);
        setLocation(getX()+1,getY());
    }    
}
