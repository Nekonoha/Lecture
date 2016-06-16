import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    double stopDist = Math.random()*50;
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null){
            int mx = Greenfoot.getMouseInfo().getX();
            int my = Greenfoot.getMouseInfo().getY();
            turnTowards(mx,my);
            if(calcDist(getX(),mx,getY(),my) > stopDist){
                move(1);
            }else{
                
            }
           // System.out.println(Greenfoot.getMouseInfo());
        }
       
    }    
    
    public double calcDist(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }
}
