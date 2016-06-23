/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kadai02 {
   public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add("Ruby");
        list.add("Python");
        
        System.out.println("=== リストの要素一覧 ===");
        for(Iterator it = list.iterator(); it.hasNext(); ){
            System.out.print(it.next() + " ");
        }
        
        System.out.println("=== リストに含まれるか ===");
        if(list.contains("Go")) System.out.println("要素Goはリストに含まれています"); 
        else System.out.println("要素Goはリストに含まれていません");
        
        System.out.println("=== リストの要素の変更 ===");
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("Ruby")) list.set(i, "Go");
            System.out.print(list.get(i) + " ");
        }
        
    }   
}
