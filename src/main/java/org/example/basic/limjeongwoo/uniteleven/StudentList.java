package org.example.basic.limjeongwoo.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));

        students.remove("Charlie");

        System.out.println("전체 학생: " + students);

        System.out.println("인덱스 1번 학생: " + students.get(1));

    }

}
