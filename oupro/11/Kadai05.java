/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.TreeSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Kadai05 {
    public static void main(String[] args){
        String str = "An eye for an eye, a tooth for a tooth.";
        String[] text = str.toLowerCase().replaceAll("[\\W]+"," ").split(" ");
        
        Map<String,Integer> map = new TreeMap<>();
        
        
        
        for(String s: text){
            map.put(s,0);
        }
        
        for(String s: text){
            map.put(s,map.get(s) + 1);
        }
              
        
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        
        for(Map.Entry<String,Integer> entry : entries){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "\t : " + value);
        }
    }
}
