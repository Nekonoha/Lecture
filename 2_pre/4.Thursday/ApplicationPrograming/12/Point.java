package kg12;

import java.util.Random;

public class Point {
    private int x;
    private int y;
    
    /**
     * 引数無しのコンストラクタは、
     * xを10以上20未満の乱数で、yを100以上110未満の乱数で初期化します。
     * 乱数の生成にはgetRand()メソッドを利用します。
     */
    public Point(){
        x = getRand(10,20);
        y = getRand(100,110);
    }
    
    /**
     * getRand()メソッドはint型の乱数を返します。
     * 乱数の範囲はbase以上bound未満です。
     * 
     * @param base 乱数の下限
     * @param bound 乱数の上限（この値は含まない）
     * @return base以上bound未満の乱数
     */
    public static int getRand(int base, int bound){
        return new Random().nextInt(bound-base)+base;
    }
    
    @Override
    public String toString(){
        return "(x, y) = (" + x + ", " + y + ")";
    }
    
}
