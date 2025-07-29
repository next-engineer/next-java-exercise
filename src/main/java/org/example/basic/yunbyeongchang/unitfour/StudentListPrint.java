package org.example.basic.yunbyeongchang.unitfour;

import java.util.ArrayList;

public class StudentListPrint implements StudentPrint{

    //method
    @Override
    public void print(ArrayList<Student> students)
    {
        for(Student student : students)
            student.printInfo();
    }
}
