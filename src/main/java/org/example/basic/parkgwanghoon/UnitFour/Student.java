package org.example.basic.parkgwanghoon.UnitFour;

public class Student {

    //생성자
    private int studentNumber;
    private String name;
    private int score;

    //학생 정보
    public Student(int studentNumber, String name, int score) {

        this.studentNumber = studentNumber;
        this.name = name;
        this.score = score;
    }

    //게터 메서드
    public int getScore() {
        return score;
    }

    //점수 출력 메서드
    public void printInfo() {

        System.out.println("학번: " + studentNumber);
        System.out.println("성명: " + name);
        System.out.println("점수: " + score + "점");
    }

    // 고득점 여부 확인
    public boolean getHighScore() {
        return score >= 90;
    }
    @Override
    public String toString() {
        return "학번: " + studentNumber + ", 성명: " + name + ", 점수: " + score + "점";
    }
}
