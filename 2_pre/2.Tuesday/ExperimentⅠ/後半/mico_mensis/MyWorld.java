import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Map;
import java.util.TreeMap;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /*
     * map...にエネミーが重複して出てこないようにチェックする
     * timer...敵が短時間に出てこないようにチェックする
     */
    Map<String,Integer> enemyChecker = new TreeMap<>();
    Map<String,Integer> itemChecker = new TreeMap<>();
    static long[] timer = new long[4];
    int[] randomNumber={0,0};
    long start = System.currentTimeMillis();
    long end;
    boolean bgmFlag=false;
    GreenfootSound bgm1 = new GreenfootSound("sounds/BGM/山への憧憬.mp3");
    GreenfootSound bgm2 = new GreenfootSound("sounds/BGM/snowsnow.mp3");    
    /**+
     * Constructor for objects of class MyWorld.
     * 
     */
    /*
     * timerを現在時刻に設定
     * enemyCheckerをそれぞれ1に設定
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        timer[0]=System.currentTimeMillis();
        timer[2]=System.currentTimeMillis();
        enemyChecker.put("Skull",0);
        enemyChecker.put("bee",0);
        itemChecker.put("apple",0);
        
    }

    /*
     * 100までの乱数を回し、2以下の時に敵を発生させる。
     * 発生させた時の時間を記録し、前回の発生させた時間と1.4秒以内の場合は
     * 敵を発生させない。
     */
    public void act(){
        randomNumber[0] = Greenfoot.getRandomNumber(100);
        timer[3]=System.currentTimeMillis();
        if(bgmFlag==false){
            if(randomNumber[0]<50){
                bgm1.playLoop();
            }else{
                bgm2.playLoop();
            }
                bgmFlag=true;
        }
        if (randomNumber[0] < 2){
            timer[1]=System.currentTimeMillis();
            if(Math.abs(timer[0]-timer[1])>1400){
            timer[0]=System.currentTimeMillis();
            creatNewEnemy();
            }
        }
        if(Math.abs(timer[2]-timer[3])>=10000){
            timer[2]=System.currentTimeMillis();
            creatNewItem();
        }
    }

    /*
     * 乱数を発生させ、乱数が50未満、25以下の時にSkullを
     * 乱数が0以上25未満の時にbeeを発生させる
     */
    private void creatNewEnemy(){
        randomNumber[1]=Greenfoot.getRandomNumber(100);
        if(randomNumber[1] < 50){
            if(enemyChecker.get("Skull")<=2){
                int i=enemyChecker.get("Skull");
                i++;
                enemyChecker.put("Skull",i);
                addObject (new Skull(), 600, 350);

            }else{
                enemyChecker.put("Skull",0);
            }
        }else if(randomNumber[1] < 75){
                    if(enemyChecker.get("bee")<=2){
                        int i=enemyChecker.get("bee");
                        i++;
                        enemyChecker.put("bee",i);
                        addObject (new bee(), 600, 100);
                    }else{
                        enemyChecker.put("bee",0);
            }
    }
    }

    public void creatNewItem(){
            int i=itemChecker.get("apple");
            if(i<=1){
            addObject(new PowerUpItem(),462,Greenfoot.getRandomNumber(180)+161);
            i++;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Runner runner = new Runner();
        addObject(runner,100,227);
        runner.setLocation(110,341);
        PowerUpItem powerupitem = new PowerUpItem();
        //   addObject(powerupitem,472,164);
    }
    
    public void gameOver(){
        end = System.currentTimeMillis();
        addObject(new ScoreBoard((int)(end-start)),getWidth()/2,getHeight()/2);
        bgm1.stop();
        bgm2.stop();
        Greenfoot.playSound("sounds/SE/down.mp3");
        playBGM("sounds/BGM/death_tone.mp3");
        Greenfoot.stop();
}

    public void playBGM(String bgmPass){
        GreenfootSound gfs = new GreenfootSound(bgmPass);
        gfs.playLoop();

}
    /**
     * long型の配列タイマーを返します。
     * 0～1は敵の出現に関するもの
     * 2～3はアイテムの出現に関するもの
     */
    public static long[] getTimer(){
        return timer;
    }
}

