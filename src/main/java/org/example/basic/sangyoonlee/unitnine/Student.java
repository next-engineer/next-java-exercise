package org.example.basic.sangyoonlee.unitnine;

public class Student {
    private final String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    private String calculateGrade() {
        if(this.score >= 95) {
            return "A+";
        }

        if(this.score >= 90) {
            return "A";
        }

        if(this.score >= 85) {
            return "B+";
        }

        if(this.score >= 80) {
            return "B";
        }

        if(this.score >= 75) {
            return "C+";
        }

        if(this.score >= 70) {
            return "C";
        }

        if(this.score >= 65) {
            return "D+";
        }

        if(this.score >= 60) {
            return "D";
        }

        return "F";
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 성적: " + calculateGrade());
    }
}
