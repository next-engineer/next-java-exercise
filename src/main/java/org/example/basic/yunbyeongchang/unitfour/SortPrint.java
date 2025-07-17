package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;
import java.util.Comparator;

public class SortPrint implements  StudentPrint{

    //method
    public void print(ArrayList<Student> students)
    {
        students.stream()   // 원본 값은 변경하지 않음
                .sorted(Comparator.comparingInt(Student::getScore))    // 오름차순으로 정렬해서
                .forEach(Student::printInfo);                                   // 순서대로 printInfo 실행
    }
}
