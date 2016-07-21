import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    double a = 0;
    double b = 0;
    /**
     * Act - do whatever the a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    public void act() 
    {       
           a+=0.05;
           b+=0.04;
           //登場した位置からはじめは下に向かう
           int zengo = 3;
           //前後の動きの大きさ
           int jouge = 4;
           //上下の動きの大きさ
           setRotation(180);
           setLocation(getX() + (int)(Math.sin(a+b)*zengo), getY() + (int)(Math.sin(a)*jouge) );
           move(2);
           checkEdge();
    }
    
        public void checkEdge(){
        if(isAtEdge())
        getWorld().removeObject(this);
    }
}
