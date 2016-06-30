/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.HashMap;
import java.util.Map;

public class Kadai02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Humburger", 100);
        map.put("Cheeseburger", 130);
        map.put("Teriyaki", 310);
        map.put("Fishburger", 310);
        map.put("French fries", 250);

        System.out.println("Teriyaki : " + map.get("Teriyaki"));
        System.out.println("Cheeseburger : " + map.get("Cheeseburger"));
    }
}
