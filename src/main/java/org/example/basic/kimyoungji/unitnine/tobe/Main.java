package org.example.basic.kimyoungji.unitnine.tobe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 85, 3));
        students.add(new Student("이순신", 92, 4));
        students.add(new Student("강감찬", 68, 2));

        // 점수 변경은 허용
        students.get(0).updateScore(95);

        // grade 직접 변경은 불가 (컴파일 에러)
        // students.get(0).setGrade(5);  // private 접근 불가

        // 출력
        for (Student s : students) {
            s.printInfo();
        }
    }
}