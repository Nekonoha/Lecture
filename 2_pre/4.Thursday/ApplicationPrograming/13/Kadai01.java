/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

public class Kadai01 {

    public static void main(String[] args) {
        Student[] st = new Student[3];

        st[0] = new Student("C0115991", 83);
        st[1] = new Student("C0115992", 57);
        st[2] = new Student("C0115993", 70);

        for (Student s : st) {
            System.out.println(s.getID() + ", " + s.getScore() + ", " + s.getGrade());
        }

        System.out.println("1番目の学生の得点に５点加えます");
        st[1].add(5);

        for (Student s : st) {
            System.out.println(s.getID() + ", " + s.getScore() + ", " + s.getGrade());
        }

    }
}
