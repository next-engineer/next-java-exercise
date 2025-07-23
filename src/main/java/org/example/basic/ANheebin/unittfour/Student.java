package org.example.basic.ANheebin.onepROJECT.unittfour;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}