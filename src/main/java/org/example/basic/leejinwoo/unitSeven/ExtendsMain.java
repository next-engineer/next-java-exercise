package org.example.basic.leejinwoo.unitSeven;

public class ExtendsMain {
    public static void main(String[] args) {
        Student s = new Student("jinWoo", 29, "서울대학교");
        Worker w = new Worker("minSu", 30, "카카오");

        s.introduce();
        s.study();

        w.introduce();
        w.work();
    }
}
