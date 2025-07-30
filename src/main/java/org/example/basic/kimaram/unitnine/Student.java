package org.example.basic.kimaram.unitnine;

public class Student {
    private String name;        // 공개할 필요 없음: 캡슐화
    private int score;          // 점수도 직접 접근 못하도록 숨김
    private int grade;          // 캡슐화

    // 생성자
    public Student(String name, int score, int grade) {
        this.name = name;
        setScore(score);    // 유효성 검사를 포함한 setter 사용
        setGrade(grade);
    }

    // Getter (읽기)
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    // Setter (쓰기) : 점수 유효성 검사 포함
    public void setScore(int score) {
        // 점수 유효 범위 : 0 ~ 100
        if (score >= 0 && score <= 100){
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6){
            this.grade = grade;
        } else {
            System.out.println("학년은 1 ~ 6 사이여야 합니다.");
        }
    }

    // 점수를 기준으로 A,B,C 등의 등급을 반환하는 매서드
    public String getGradeLevel(int score) {
        String rank = "";
        if (score >= 90) {
            rank = "A";
        } else if (score >= 80) {
            rank = "B";
        } else if (score >= 70){
            rank = "C";
        } else {
            rank = "D";
        }
        return rank;
    }

    // 정보 출력
    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score + ", 학년: " + grade + ", 등급: " + getGradeLevel(score));
    }
}
