/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

public class Kadai01 {

    public static void main(String[] args) {
        Coffee[] cups = new Coffee[3];
        System.out.println("Total Vol: " + Coffee.getTotalVol());
        cups[0] = new Coffee(180);
        cups[1] = new Coffee(150);
        cups[2] = new Coffee(240);
        System.out.println("Total Vol: " + Coffee.getTotalVol());
        
    }
}
