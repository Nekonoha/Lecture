/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.*;

public class Kadai02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Tokyo");
        set.add("Kanagawa");
        set.add("Saitama");
        set.add("Kanagawa");
        set.add("Tokyo");
        
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }

}
