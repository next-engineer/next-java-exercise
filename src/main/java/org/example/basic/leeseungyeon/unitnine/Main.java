package org.example.basic.leeseungyeon.unitnine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 학생 3명 생성
        Student s1 = new Student("남도일", 85, 3);
        Student s2 = new Student("유미란", 92, 5);
        Student s3 = new Student("하인성", 76, 2);

        // 리스트에 추가
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // 전체 출력
        for (Student s : students) {
            s.printInfo();
        }
    }
}