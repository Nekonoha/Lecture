import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpItem extends Actor
{
    long itemTimer0=0;
    long[] timer= new long[4];
    public PowerUpItem(){
        //Myworldからタイマーを受け取る
        timer=MyWorld.getTimer();
    }
    /**
     * Act - do whatever the skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkEdge();
        checkFresh();
        itemTimer0 +=1;
    }
    public void checkEdge(){
        if(isAtEdge())
            getWorld().removeObject(this);
        if(isTouching(Runner.class)){
            getWorld().removeObject(this);
    }
    }
    /*
     *りんごは3秒後に消えるように設定する
     *
     */
    public void checkFresh(){
        if(Math.abs(timer[2]-timer[3])>3000){
            getWorld().removeObject(this);
    }
}
}

