package org.example.basic.yunbyeongchang.unitfour;

public class Student {
    //var
    private String name;
    private int score;

    //method
    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public void printInfo()         // 학생 정보 출력
    {
        System.out.println("---------------------");
        System.out.println("이름: " + this.name);
        System.out.println("점수: " + this.score);
    }

    public void getHighScore()      // 고득점 학생 출력
    {
        if(this.score >= 90) this.printInfo();
    }

}
