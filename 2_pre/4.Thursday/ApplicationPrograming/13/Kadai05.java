/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kadai05 {
    
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2016, 0, 1);
        c.add(Calendar.MONTH, -3);
        c.add(Calendar.DATE, -10);
        SimpleDateFormat dft = new SimpleDateFormat("yyyy年MM月dd日");
        
        
        System.out.println(dft.format(c.getTime()));
    }
}
