/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Kadai03 {

    public static void main(String[] args) {
        List list = new ArrayList();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(6));
        }

        int count = 0;
        for (Iterator itr = list.iterator(); itr.hasNext();) {
            Object num = itr.next();
            if (num.toString().equals("0")) {
                count++;
            }
            System.out.print(num + ",");
        }
        System.out.println("");
        System.out.println("0は" + count + "個ありました");

    }
}
