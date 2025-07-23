package org.example.basic.leejinwoo.unitNine;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student studentOne = new Student("lee", 100, 1);
        students.add(studentOne);

        Student studentTwo = new Student("jin", 80, 2);
        students.add(studentTwo);

        Student studentThree = new Student("lee", 50, 4);
        students.add(studentThree);

        for(Student list : students){
            list.printInfo();
        }
    }


}
