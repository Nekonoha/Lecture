/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.*;

class Kadai05 {
    public static void main(String[] args) {
        String text = "To be, or not to be: that is the question";
        String t = text.toLowerCase().replaceAll("[\\W]+"," ");
        String[] s = t.split(" ");
        Set<String> set = new TreeSet();
        
        for(String str : s){
            set.add(str);
        }
        
        
        System.out.println("元の文章: " + text);
        System.out.println("単語数: " + set.size());
        System.out.print("単語一覧: ");
        for(String str : set){
            System.out.print(str + " "); 
        }
        //Set set = new LinkedHashSet();
        //set.addAll();
        
        
        
        


    }

}
