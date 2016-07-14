/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

public class Kadai04 {
    
    public static void main(String[] args){
        String html = "http://www.teu.ac.jp/gakubu/cs/006333.html";
        
        System.out.println(html.replaceAll("\\d", "*"));
        System.out.println(html.replaceAll("\\.", "*"));
        System.out.println(html.replaceAll("[abc]", "*"));
        System.out.println(html.replaceAll("^h", "*"));
        System.out.println(html.replaceAll("\\w+", "*"));
    }
}
