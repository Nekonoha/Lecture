/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

import java.util.Arrays;
import java.util.List;

public class Kadai02 {
    
    public static void main(String[] args) {
        String input = "School of Computer Science";
        
        System.out.println(input.length());
        System.out.println(input.substring(input.indexOf("mpu"), input.indexOf("mpu")+3));
        System.out.println(input.lastIndexOf("e", 24));
        System.out.println(input.contains("put"));
        List<String> list  = Arrays.asList(input.split("(o)"));
        
        System.out.println(list.size());
        System.out.println(list);
        
        
                

    }
}
