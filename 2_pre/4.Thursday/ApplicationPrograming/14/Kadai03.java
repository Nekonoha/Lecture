/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

import java.util.ArrayList;

public class Kadai03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");

        System.out.println("リストの大きさ : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        list.add(1, "Go");
        list.remove("Ruby");
        list.add(0, "Perl");
        System.out.println("リストの大きさ : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

    }
}
