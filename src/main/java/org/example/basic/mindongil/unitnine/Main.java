package org.example.basic.mindongil.unitnine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Student s1 = new Student("홍길동", 85);
//        s1.printInfo();
//
//        // 점수 변경
//        s1.setScore(95);
//        s1.printInfo();
//
//        //0~100이 아니면 경고 출력
//        s1.setScore(200);
//
//        //직접 접근시 컴파일 에러
////         s1.score = 50;

        //등급 설정
        List<Grade> students = new ArrayList<>();

        students.add(new Grade("짱구", 1));
        students.add(new Grade("맹구", 3));
        students.add(new Grade("철수", 5));

        //오류 점수 설정
        students.add(new Grade("유리", 7));

        for (Grade student : students) {
            student.printInfo();
        }


    }
}
