/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oupro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class Kadai02 {
    public static void main(String[] args){
        Date date = new Date();
        String output;
        SimpleDateFormat dft;
        dft = new SimpleDateFormat("yyyy年M月d日(E) a K:m:s.S z");
        output = dft.format(date);
        System.out.println(output);
        
        Calendar cal = Calendar.getInstance();
        
        System.out.println("1月1日から数えて"+ cal.get(Calendar.DAY_OF_YEAR) + "日目");
        
    }
}
