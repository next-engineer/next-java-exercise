package org.example.basic.gojunho.unitnine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> slist = new ArrayList<>();

        slist.add(new Student("홍길동",2));
        slist.add(new Student("고준호",3));
        slist.add(new Student("오바마",6));

        for(Student s : slist){
            s.getGradeLevel();
            s.printInfo();
        }

    }
}
