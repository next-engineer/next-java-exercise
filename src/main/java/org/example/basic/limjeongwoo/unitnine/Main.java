package org.example.basic.limjeongwoo.unitnine;

public class Main {
    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        s1[0] = new Student("임정우", 85, 3);
        s1[1] = new Student("정승우", 92, 2);
        s1[2] = new Student("박상민", 67, 1);

        for (Student s : s1) {
            s.printInfo();
        }

        s1[0].setScore(101);
        s1[0].setGrade(0);

        s1[0].setScore(77);
        s1[0].setGrade(4);

        s1[0].printInfo();
    }
}
