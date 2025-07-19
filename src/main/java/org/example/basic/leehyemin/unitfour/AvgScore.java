package org.example.basic.leehyemin.unitfour;

import java.util.List;

public class AvgScore {
    public void avgScore(List<Student> students) {
        int total = 0;
        int avg = 0;

        for (Student student : students) {
            total += student.getScore();
        }

        avg = total / students.size();
        System.out.println("평균 점수 : "+avg);
    }
}
