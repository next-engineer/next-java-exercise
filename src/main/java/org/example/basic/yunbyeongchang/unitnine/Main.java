package org.example.basic.yunbyeongchang.unitnine;

import java.util.ArrayList;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        //Student student = new Student("홍길동", 85);
        //student.printInfo();

        //점수 변경
        //student.setScore(75);
        //student.printInfo();

        //범위 외 점수 입력
        //student.setScore(150);

        //직접 접근 시도
        //student.score = 50;     // score has private access in Student

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 85));
        students.add(new Student("김철수", 100));
        students.add(new Student("신짱구", 55));
        students.add(new Student("김수한무", 10));

        for (Student student : students) {
            student.printInfo();
        }
        System.out.println("----------------------------------");
        students.get(1).setScore(25);
        for (Student student : students) {
            student.printInfo();
        }

    }
}
