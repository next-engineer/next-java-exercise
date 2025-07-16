package org.example.basic.gojunho.unitfour;

import java.util.*;

public class Student {
    private String name;
    private int score;
    Scanner sc = new Scanner(System.in);

    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(Scanner sc){
        this.score=sc.nextInt();
    }

    @Override
    public String toString() {
        return name + ": " + score + "점";
    }

    public void getHighScore(){
        if(score>=90 && score<=100) {
            System.out.println("이름:"+name+" 점수:"+score);
        }

    }
}
