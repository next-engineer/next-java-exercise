package org.example.basic.sangyoonlee.unitfour;

public class Student {
    private final String name;
    private final int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("점수: " + score);
    }

    public void printIfHighScore() {
        if (score >= 90) {
            System.out.println("이름: " + name);
            System.out.println("점수: " + score);
        }
    }
}
