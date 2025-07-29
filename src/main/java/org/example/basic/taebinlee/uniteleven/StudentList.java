package org.example.basic.taebinlee.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>(Arrays.asList("Taebin","Kevin","Robin","Rocky"));

        students.remove("Taebin");

        System.out.println("학생 리스트 출력: "+ students);

        System.out.println("인덱스 0번 학생 ?: " + students.get(0));
    }
}