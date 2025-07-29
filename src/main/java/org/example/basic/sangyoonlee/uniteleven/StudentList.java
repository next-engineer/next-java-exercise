package org.example.basic.sangyoonlee.uniteleven;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String studentToRemove = "Charlie";

        List<String> studentArray = new ArrayList<>();
        Collections.addAll(studentArray, students);
        studentArray.remove(studentToRemove);

        System.out.println("▶ ArrayList 결과");
        System.out.println("전체 학생: " + studentArray);
        System.out.println("인덱스 1번 학생: " + studentArray.get(1));
        System.out.println();
    }
}
