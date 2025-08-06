package org.example.basic.taebinlee.unitnine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<org.example.basic.parkminji.unitnine.Student> students = new ArrayList<>();

        // 학생
        students.add(new org.example.basic.parkminji.unitnine.Student("태빈", 92, 3));
        students.add(new org.example.basic.parkminji.unitnine.Student("동영", 75, 2));
        students.add(new org.example.basic.parkminji.unitnine.Student("희근", 58, 1));
        students.add(new org.example.basic.parkminji.unitnine.Student("태현", 85, 4));

        // 전체
        for (org.example.basic.parkminji.unitnine.Student s : students) {
            s.printInfo();
        }

        // 점수와 학년 테스트
        System.out.println("\n잘못된 입력 테스트:");
        org.example.basic.parkminji.unitnine.Student invalidStudent = new org.example.basic.parkminji.unitnine.Student("오류 학생", 150, 10);  // 경고 출력
        invalidStudent.printInfo();
    }
}
