/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg03_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Kadai02_1 {
    public static void main(String[] args){       
        List<Animal> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data21.csv")));
            String line;

            while ((line = br.readLine()) != null) {
                Animal animal = new Animal();
                String[] word = line.split(",");
                animal.setNo(Integer.parseInt(word[0]));
                animal.setNameA(word[1]);
                animal.setNameB(word[2]);
                animal.setNameC(word[3]);
                
                list.add(animal);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(Animal a:list) a.printAnimal();
    }
}
