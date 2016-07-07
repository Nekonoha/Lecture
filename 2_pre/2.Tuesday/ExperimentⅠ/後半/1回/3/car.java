import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-1);
            setRotation(-90);
        }else if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+1);
            setRotation(90);
        }else if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-1,getY());
            setRotation(180);
        }else if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+1,getY());
            setRotation(0);
        }
    }    
}
