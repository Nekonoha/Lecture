import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        move(1);
        int a = Greenfoot.getRandomNumber(3)-1;
        int b = Greenfoot.getRandomNumber(3)-1;
        
        setLocation(getX()+a*5,getY()+b*5);
        
    }    
}
