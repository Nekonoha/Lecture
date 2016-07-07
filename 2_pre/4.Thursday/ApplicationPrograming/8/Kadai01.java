/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oupro;

import java.text.DateFormat;
import java.util.Date;


public class Kadai01 {

    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("Dateクラスのインスタンスを直接出力");
        System.out.println(date);

        String output;
        DateFormat dft;
        dft = DateFormat.getDateInstance();
        output = dft.format(date);

        System.out.println("日付のみ");
        System.out.println(output);
        
        dft = DateFormat.getDateTimeInstance();
        output = dft.format(date);
        
        System.out.println("日付と時刻");
        System.out.println(output);
        
        dft = DateFormat.getTimeInstance();
        output = dft.format(date);
        
        System.out.println("時刻のみ");
        System.out.println(output);
    }
}
