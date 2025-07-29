package org.example.basic.kimaram.uniteleven;

import java.util.*;

// 과제 1. 학생 이름 목록 다루기
// 목표  : List<String>을 사용하여 학생 이름 목록을 다루는 프로그램을 작성하세요
public class StudentList {
    public static void main(String[] args) {
        // 1) 학생 이름을 5명 이상 추가
        List<String> students = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));

        // 2) 특정 학생 이름을 삭제
        students.removeIf(student -> student.equals("Charlie"));

        // 3) 인덱스를 이용해 특정 학생 이름 출력
        System.out.println("[특정 학생 이름]");
        System.out.println(students.get(1));    // Bob 출력

        // 4) 전체 학생 목록을 출력
        System.out.println("[전체 학생 목록]");
        students.forEach(System.out::println);
    }
}
