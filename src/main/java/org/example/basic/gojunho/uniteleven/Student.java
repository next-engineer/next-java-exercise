package org.example.basic.gojunho.uniteleven;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Student {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","David","Eve"));
        System.out.println("입력: " + sList);

        String removedStudent = sList.remove(1);
        System.out.println("삭제: " + removedStudent);
        System.out.println("출력:"+ sList.get(1));
        System.out.println("전체 학생: "+sList);
        for(int i=0;i<sList.size();i++){
            System.out.println("인덱스 "+i+"번 학생: "+sList.get(i));
        }

    }
}

