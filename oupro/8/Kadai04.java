/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oupro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kadai04 {

    public static void main(String[] args) {
        SimpleDateFormat dft;
        dft = new SimpleDateFormat("yyyy/M/d");
        
        
        Date d1 = new Date(2016-1900,6,9);
        String o1 = dft.format(d1);
        System.out.println(d1.getTime() + "ミリ秒");
        
        Date d2 = new Date(2017-1900,1,30);
        System.out.println(d2.getTime() + "ミリ秒");
        
        long n = d2.getTime() - d1.getTime();
        long result = n/(1000*60*60*24);
        System.out.println(result + "日");
        
    }
}
