/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Kadai04 {
    public static void main(String[] args){
        Map<String, String> map = new LinkedHashMap<>();
        
        map.put("C0115995","C");
        map.put("C0115991","B");
        map.put("C0115997","X");
        map.put("C0115993","A");
        map.put("C0114991","B");
        
        map.remove("C0115997");
        map.put("C0115993", "S");
        map.put("C0115881", "C");
        
        Set<Map.Entry<String, String>> entries = map.entrySet();
        
        for(Map.Entry<String,String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }
}
