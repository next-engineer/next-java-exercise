package org.example.basic.leehyemin.uniteleven;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();

        students.add("Alice");
        students.add("Bob");
        students.add("Carlie");
        students.add("David");
        students.add("Eve");

        students.remove("Charlie");

        System.out.println("전체 학생 : "+students);

        System.out.println("인덱스 1번 학생 : "+students.get(0));

    }
}
