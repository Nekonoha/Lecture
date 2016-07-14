/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

import java.util.Random;

public class Kadai06 {
    
    public static void main(String[] args){
        for (int i = 0; i < 20; i++) {
            System.out.printf("C0115%03d \n" , new Random().nextInt(400)+1);
        }
             
    }
}
