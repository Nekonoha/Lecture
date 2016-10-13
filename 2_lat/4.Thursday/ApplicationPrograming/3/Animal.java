/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg03_2;

public class Animal {

    private int no;
    private String nameA;
    private String nameB;
    private String nameC;

    void setNo(int n) {
        no = n;
    }

    void setNameA(String a) {
        nameA = a;
    }

    void setNameB(String b) {
        nameB = b;
    }

    void setNameC(String c) {
        nameC = c;
    }

    int getNo() {
        return no;
    }

    String getNameA() {
        return nameA;
    }

    String getNameB() {
        return nameB;
    }

    String getNameC() {
        return nameC;
    }

    void printAnimal() {
        System.out.println(no + ". " + nameA + "(" + nameB + ") :" + nameC);
    }

}
