/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Kadai04 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(20));
        }
        
        System.out.println("乱数を20回出力します");
        for(int i: list){
            System.out.print(i + ",");
        }
        System.out.println("");
        
        
        set.addAll(list);
        System.out.println("乱数は" + set.size() + "個ありました");
        
        for(int i: set){
            System.out.print(i + ",");
        }
    }
}
