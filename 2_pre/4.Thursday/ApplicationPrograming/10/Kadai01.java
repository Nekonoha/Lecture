/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.*;

public class Kadai01 {
    public static void main(String[] args){
        List list = new ArrayList();
        
        list.add("red");
        list.add("green");
        list.add("blue");
        
        for(Iterator it = list.iterator(); it.hasNext(); ){
            String s = (String) it.next();
            System.out.println(s.toUpperCase());
        }
    }
}
