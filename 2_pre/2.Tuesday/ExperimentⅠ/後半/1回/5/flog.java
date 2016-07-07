import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class flog extends Actor
{
    /**
     * Act - do whatever the flog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            flogMove(5);
        }
    }    
    
    public void flogMove(int step){
        int a = Greenfoot.getRandomNumber(10);
        int b = Greenfoot.getRandomNumber(10);
        Greenfoot.playSound("kaeru01.mp3");
        
        a = a%step -2;
        b = b%step -2;
        
        setLocation(getX()+a*20, getY()+b*20);
        
    }
}
