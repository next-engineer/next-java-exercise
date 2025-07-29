package org.example.basic.leeseungyeon.unitfour;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }

    public boolean isHighScore() {
        return score >= 90;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}