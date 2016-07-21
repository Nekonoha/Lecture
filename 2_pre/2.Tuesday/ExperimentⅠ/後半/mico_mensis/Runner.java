import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends AnimatedActor
{
    private static final int JumpStrength = 40;
    final int startY=341;
    static int bonusPoint=0;
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
        checkKeys();
        checkFall();
        if(getY()>startY)
        setLocation(getX(),startY);
    }
    public void checkKeys(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+10,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-10,getY());
        }
        if(Greenfoot.isKeyDown("space")){
            if(getY()==startY)
            jump();
        }
        if(isTouching(PowerUpItem.class)){
            bonusPoint++;
            Greenfoot.playSound("sounds/SE/scoreUP.mp3");
        }else if(isTouching(null)){
            ((MyWorld) getWorld()).gameOver();
        }
    }
    private void jump(){
        Greenfoot.playSound("sounds/SE/jump.mp3");
        setVSpeed(-JumpStrength);
        fall();
    }
    
    private void checkFall(){
        if(getY()>=startY){
            setVSpeed(0);
        }else{
            fall();
        }
    }
    public static int getBonusPoint(){
        return bonusPoint;
    }
}