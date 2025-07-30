package org.example.basic.limjeongwoo.unitnine;

public class Student {
    private String name;
    private int score;
    private int  grade;


    public Student(String name, int score, int grade) {
        this.name = name;
        setScore(score);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        } else {
            System.out.println("1 ~ 6 사이여야 합니다.");
        }
    }

    public String getGradeLevel() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else return "C";
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}
