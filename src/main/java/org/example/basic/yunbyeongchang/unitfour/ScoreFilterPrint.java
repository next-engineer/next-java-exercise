package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreFilterPrint implements StudentPrint{

    //method
    @Override
    public void print(ArrayList<Student> students)
    {
        System.out.print("점수를 입력해주세요.: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println("---------------------");
        System.out.println(score + "점 이상 학생");

        for (Student student : students)
            student.getHighScore(score);
    }
}
