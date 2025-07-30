package org.example.basic.parkgwanghoon.UnitNine;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍길동", 1));
        studentList.add(new Student("김영희", 2));
        studentList.add(new Student("이철수", 3));
        studentList.add(new Student("박민수", 4));
        studentList.add(new Student("최지우", 5));

        for (Student s : studentList) {
            s.printInfo();
        }
    }
}
