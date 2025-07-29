package org.example.basic.leeseungyeon.unitnine;

public class Student {
    private String name;
    private int score;
    private int grade;

    // 생성자
    public Student(String name, int score, int grade) {
        this.name = name;
        setScore(score); // 유효성 검사 포함
        setGrade(grade); // 유효성 검사 포함
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    // Setter
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("⚠️ 점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        } else {
            System.out.println("⚠️ 학년은 1 ~ 6 사이여야 합니다.");
        }
    }

    // 점수를 기반으로 등급 반환
    public String getGradeLevel() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    // 학생 정보 출력
    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score + ", 학년: " + grade + ", 등급: " + getGradeLevel());
    }
}