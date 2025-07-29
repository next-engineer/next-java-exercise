package org.example.basic.mindongil.unitfour;

public class Student {

    private String studentName;
    private int studentScore;

    Student(String name, int score) {
        this.studentName = name;
        this.studentScore = score;
    }

    public int getStudentScore() {
        return studentScore;
    }

    //고득점 출력
    public void getHighScore() {
        if(studentScore >= 90){
            System.out.println("고득점자 : " + studentName);
        }
    }

    //학생 정보 출력
    public void printStudentInfo() {
        System.out.println("이름: " + studentName);
        System.out.println("점수: " + studentScore);
        System.out.println();
    }

}
