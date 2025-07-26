package org.example.basic.yunbyeongchang.uniteleven.homework.student;

import java.util.*;

public class Student {
    //var

    //method
    public static void main(String[] args)
    {
        //생성
        List<String> students = new ArrayList<>(Arrays.asList("Gregor"));

        //추가
        students.add("Alice");  students.add("Bob");  students.add("Charlie");
        students.add("David");  students.add("Eve");  //students.add(null);

        //제거
        students.remove("Charlie");

        //전체 출력
        System.out.println(students);

        //인덱스 출력
        PrintStudentList.printByIndex(students, 1);
        //PrintList.printByIndex(students, 4); // ERROR: NullReferenceIndex


        //for 출력
        PrintStudentList.printFor(students);

    }
}
