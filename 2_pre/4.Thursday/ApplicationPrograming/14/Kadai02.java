/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

public class Kadai02 {

    public static void main(String[] args) {
        Box b = new Box(3,4);
        System.out.println(b);
        System.out.println(b.getDiagonal());
        
        b.changeSize(2,8);
        System.out.println(b);
        System.out.println(b.getDiagonal());
    }
}
