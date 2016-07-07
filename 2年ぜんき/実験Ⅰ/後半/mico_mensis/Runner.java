import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends AnimatedActor
{
    public Runner(){
        super("run",".gif",8);
    }
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        move(5);
        if(Greenfoot.isKeyDown("space")){
            AnimatedActor junper = new AnimatedActor("jump",".gif",10);
        }
        if(isTouching(null)){
            Greenfoot.stop();
        }
}
}
