/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.*;

public class Kadai03 {
    public static void main(String[] args) {
        Set<String> A = new HashSet<String>();
        Set<String> B = new HashSet<String>();
        
        A.add("Tokyo");
        A.add("Kanagawa");
        A.add("Saitama");
        B.add("Tokyo");
        B.add("Gunma");
        B.add("Kyoto");
        B.add("Saitama");
        
        Set<String> AB = new TreeSet<>(A);
      //  AB.addAll(A);
        AB.addAll(B);

        for(String str: AB){
            System.out.println(str);
        }
        
    }
}
