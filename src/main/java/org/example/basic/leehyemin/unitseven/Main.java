package org.example.basic.leehyemin.unitseven;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("이혜민", 30, "연세대학교");
        Worker worker=new Worker("이현수", 34, "네이버");

        student.introduce();
        student.study();

        System.out.println();

        worker.introduce();
        worker.work();
    }
}
