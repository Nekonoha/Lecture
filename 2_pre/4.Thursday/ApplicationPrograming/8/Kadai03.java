/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oupro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Kadai03 {
    public static void main(String[] args) {
        Date date = new Date();
        String output;
        SimpleDateFormat dft;
        dft = new SimpleDateFormat("yyyy年M月d日(E)");
        output = dft.format(date);
        System.out.println("今日は\n" + output + "です");
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 2);
        cal.add(Calendar.DATE, 23);
        String[] week = {"日","月","火","水","木","金","土"};
        System.out.println("今日から2ヶ月と23日後は" + dft.format(cal.getTime()) +  "です");
       
    }
}
