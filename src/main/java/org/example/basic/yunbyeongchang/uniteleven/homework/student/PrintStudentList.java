package org.example.basic.yunbyeongchang.uniteleven.homework.student;


import java.util.*;

public class PrintStudentList {
    //var

    //method
    public static void printByIndex(List<String> list, int index)
    {
        if(list.get(index) != null)
            System.out.println("Index [1] Student: " + list.get(1));
        else    // add()하지 않은 Index를 참조하거나 add(null) 등을 시행했을 때
            System.err.println("ERROR: NullReferenceIndex");
    }

    public static void printFor(List<String> list)
    {
        for(String student: list)
        {
            if(student != null)
                System.out.println("Index [" + list.indexOf(student) + "] Student: " + student);
            else
                System.err.println("ERROR: NullReferenceIndex");
        }
    }


}
