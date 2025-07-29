package org.example.basic.kimyoungji.unitnine.tobe;

public class Student {
    private String name;
    private int score;
    private int grade;

    // 생성자에서 grade를 초기화하도록 강제
    public Student(String name, int score, int grade) {
        this.name = name;
        updateScore(score);     // setter 대체
        setGrade(grade);        // private: 생성자 내부에서만 사용
    }

    // Getter만 공개
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public String getGradeLevel() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    // 점수를 변경할 수 있는 명시적 메서드
    public void updateScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0~100 사이여야 합니다.");
        }
    }

    // 학년은 외부에서 변경 불가
    private void setGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        } else {
            System.out.println("학년은 1~6 사이여야 합니다.");
        }
    }

    public void printInfo() {
        System.out.printf("이름: %s / 점수: %d / 학년: %d / 등급: %s%n",
                name, score, grade, getGradeLevel());
    }
}