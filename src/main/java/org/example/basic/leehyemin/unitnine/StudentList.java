package org.example.basic.leehyemin.unitnine;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student("이혜민", 80, 5);
        Student s2 = new Student("이현수", 55, 4);
        Student s3 = new Student("이태석", 90, 2);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        for (Student student : studentList){
            student.printInfo();
        }
    }

}
