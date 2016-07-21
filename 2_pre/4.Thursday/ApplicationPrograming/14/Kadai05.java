/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

import java.util.Map;
import java.util.TreeMap;

public class Kadai05 {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("MILK", 1);
        map.put("TOMATO", 3);
        map.put("YOGURT", 4);
        
        System.out.println("--- STEP 1 ---");
        
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
        
        System.out.println("--- STEP 2 ---");
        
        for(Map.Entry<String,Integer> e : map.entrySet()){
            e.setValue(e.getValue()-1);
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    }
}
