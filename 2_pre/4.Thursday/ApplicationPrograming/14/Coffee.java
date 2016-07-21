/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

/**
 *
 * @author nekonoha
 */
class Coffee {
    private static int total_vol;
    
    public Coffee(int vol) {
        total_vol += vol;
    }
    
    public static int getTotalVol(){
        return total_vol;
    }
    
}
