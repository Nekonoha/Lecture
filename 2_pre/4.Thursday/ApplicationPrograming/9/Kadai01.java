/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

import java.util.ArrayList;
import java.util.List;

public class Kadai01 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("School");
        list.add("Computer");
        list.add("Science");

        System.out.println("=== リストに文字列を3つ追加します ===");
        System.out.println("要素数: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        System.out.println("=== リストの途中に文字列を1つ追加します ===");
        list.add(1,"of");
        System.out.println("要素数: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
}
