package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("학생1", 50));
        students.add(new Student("학생2", 90));

        for (Student student : students)
            student.printInfo();

        System.out.println("---------------------");
        System.out.println("90점 이상 학생");

        for (Student student : students)
            student.getHighScore();

    }

}
