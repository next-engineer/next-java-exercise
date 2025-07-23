package org.example.basic.kimaram.unitnine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 85, 3);
        student1.printInfo();   // 이름 : 홍길동, 점수: 85

        // 점수 변경
        student1.setScore(95);
        student1.printInfo();   // 이름: 홍길동, 점수: 95

        // 잘못된 점수 입력
        student1.setScore(150); // 경고 출력
        student1.setGrade(8);

        // 에러: score는 private 접근 불가
        // student1.score = 50;

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(new Student("김개똥", 77, 2));
        students.add(new Student("박수철", 88, 5));
        students.add(new Student("이하이", 55, 1));

        for(Student item: students) {
            item.printInfo();
        }




    }
}
