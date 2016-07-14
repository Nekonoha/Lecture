/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13_2;

public class Student {
    private String id;
    private int score;
    
    public Student(String id, int score){
        this.id = id;
        this.score = score;
    }
    
    public String getID(){
        return id;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getGrade(){
        if(score >= 80){
            return "A";
        }else if(score >= 70){
            return "B";
        }else if(score >= 60){
            return "C";
        }else{
            return "D";
        }
    }
    
    public void add(int n){
        score += n;
    }
}
