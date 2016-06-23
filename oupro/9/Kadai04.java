/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Kadai04 {

    public static void main(String[] args) {
        Random rnd = new Random();

        List<String> list = new ArrayList<String>();
        list.add("Without");
        list.add("haste");
        list.add("but");
        list.add("without");
        list.add("rest");

        System.out.println("=== 元の文字列 === \n Without haste, but without rest.");
        System.out.println("=== リストの要素 === ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== リストの要素からwithoutを削除する ===");

        for (Iterator it = list.iterator(); it.hasNext();) {
            Object obj = it.next();
            if (obj.toString().toLowerCase().equals("without")) {
                it.remove();
                continue;
            }
            System.out.println(obj);
        }

        System.out.println("=== リストの要素からwithoutを削除する ===");

        for (Iterator it = list.iterator(); it.hasNext();) {
            if (it.next().toString().toLowerCase().equals("without")) {
                it.remove();
                
            }
            
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}
