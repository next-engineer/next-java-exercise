package org.example.basic.sangyoonlee.unitnine;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 97);
        student.printInfo();

        student.setScore(94);
        student.printInfo();

        student.setScore(89);
        student.printInfo();

        student.setScore(83);
        student.printInfo();

        student.setScore(77);
        student.printInfo();

        student.setScore(70);
        student.printInfo();

        student.setScore(65);
        student.printInfo();

        student.setScore(64);
        student.printInfo();

        student.setScore(59);
        student.printInfo();
    }
}
