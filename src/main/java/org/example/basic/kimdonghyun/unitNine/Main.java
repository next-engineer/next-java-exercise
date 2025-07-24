package org.example.basic.kimdonghyun.unitNine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 92, 3));
        students.add(new Student("김철수", 78, 2));
        students.add(new Student("이영희", 65, 1));
        students.add(new Student("박민준", 50, 4));
        students.add(new Student("최은지", 85, 2));

        // 전체 출력
        for (Student s : students) {
            s.printInfo();
        }
    }
}