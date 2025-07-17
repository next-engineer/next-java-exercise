package org.example.basic.leehyemin.unitfour;

import java.util.List;

public class PrintScore {
    public void printInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println("이름 : "+student.getName()+", 점수 : "+student.getScore());
        }
    }

    public void getHighScore(List<Student> students) {
        System.out.println("90점 이상 학생 목록");
        for (Student student : students) {
            if(student.getScore() >= 90){
                System.out.println(" 이름 : "+student.getName()+"("+student.getScore()+"점)");
            }
        }
    }
}
