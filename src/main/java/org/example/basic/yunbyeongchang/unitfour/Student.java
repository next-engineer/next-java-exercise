package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void getHighScore(int num)      // 고득점 학생 출력
    {
        if(this.score >= num) this.printInfo();
    }


    public String getName()
    {
        return this.name;
    }

    public int getScore()
    {
        return this.score;
    }

}
