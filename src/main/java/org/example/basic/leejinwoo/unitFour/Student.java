package org.example.basic.leejinwoo.unitFour;

public class Student {
    private String name;
    private int score;

    public Student(
            String name,
            int score
    ){
        this.name = name;
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public void printInfo(){
        System.out.println("name : " + name);
        System.out.println("score : " + score);
    }

    public void getHighScore(){
        if(score >= 90){
            System.out.println("고득점");
            System.out.println("name : " + name);
            System.out.println("score : " + score);
        }
    }
}
