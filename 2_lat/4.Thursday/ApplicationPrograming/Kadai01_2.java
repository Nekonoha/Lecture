/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kadai01_2 {

    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(new File("out11.txt")));
            String line;
            String yasai = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                String regex = "\\A[-]?[0-9]+\\z";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(line);
                if (m.find()) {
                    sum += Integer.parseInt(line);
                } else {
                    yasai += line + "/";
                }
                System.out.println(line);
            }
            br.close();

            File outFile = new File("out12.txt");
            FileWriter fw;
            try {
                fw = new FileWriter(outFile);

                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("野菜リスト:" + yasai + "\n" + "合計の値段:" + sum);
                bw.close();
            } catch (IOException ex) {
            }

            System.out.println(yasai);
            System.out.println(sum);

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

    }
}
