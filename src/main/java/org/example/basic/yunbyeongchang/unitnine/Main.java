package org.example.basic.yunbyeongchang.unitnine;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Student student = new Student("홍길동", 85);
        student.printInfo();

        //점수 변경
        student.setScore(95);
        student.printInfo();

        //범위 외 점수 입력
        student.setScore(150);

        //직접 접근 시도
        //student.score = 50;     // score has private access in Student
    }
}
