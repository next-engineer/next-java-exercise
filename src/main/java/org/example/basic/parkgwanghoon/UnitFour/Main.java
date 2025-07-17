package org.example.basic.parkgwanghoon.UnitFour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // 학생 객체 추가
        studentList.add(new Student(2025001, "김범수", 91));
        studentList.add(new Student(2025002, "김연우", 65));
        studentList.add(new Student(2025003, "박효신", 92));
        studentList.add(new Student(2025004, "신용재", 47));
        studentList.add(new Student(2025005, "하현상", 100));

        System.out.println("~~~~~ 학생 명단 ~~~~~");
        for (Student s : studentList) {
            System.out.println(s);
        }

        double sum = 0;
        for (Student s : studentList) {
            sum += s.getScore();
        }
        System.out.println("평균 점수: " + sum / studentList.size() + "점\n");

        System.out.println("\n~~~~~ 고득점자(90점 이상) ~~~~~");
        for (Student s : studentList) {
            if (s.getHighScore()) {
                System.out.println(s);
            }
        }

        System.out.println("\n~~~~~ 점수순 정렬 ~~~~~");
        studentList.sort((a, b) -> b.getScore() - a.getScore());

        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("\n~~~~~ 학생 입력 ~~~~~");
        Student newStudent = StudentInput.inputInfo();
        studentList.add(newStudent);

        System.out.println("\n~~~~~ 학생 명단 ~~~~");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
