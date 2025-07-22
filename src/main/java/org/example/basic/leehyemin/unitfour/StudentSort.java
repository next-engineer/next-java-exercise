package org.example.basic.leehyemin.unitfour;

import java.util.Comparator;
import java.util.List;

public class StudentSort {
    public void studentSortByScore(List<Student> students){
        students.sort(Comparator.comparingInt(Student::getScore).reversed());
        System.out.println("점수 순으로 정렬");
        for(int i=1; i<=students.size(); i++){
            System.out.println(i+"등 : "+students.get(i-1).getScore());
        }
    }
}
