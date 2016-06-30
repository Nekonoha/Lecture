/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.*;

public class Kadai01 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        
        map.put("C0115995","C");
        map.put("C0115991","B");
        map.put("C0115997","X");
        map.put("C0115993","A");
        map.put("C0114991","B");
        
        System.out.println("C0114991 : " + map.get("C0114991"));
        System.out.println("C0115995 : " + map.get("C0115995"));
    }
}
