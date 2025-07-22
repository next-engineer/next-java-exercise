package org.example.basic.taebinlee.unitfour;

public class Student {
    private String name;
    private int score;


    // 생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public void printInfo() {
        System.out.println("성함 : " + name);
        System.out.println("점수 : " + score);
    }

    public boolean checkHighScore() {
        return score >= 90;
    }

    public String getName() {
        return name;

    }

    public int getScore() {
        return score;
    }
}
