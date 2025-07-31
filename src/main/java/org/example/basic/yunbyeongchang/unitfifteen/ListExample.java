package org.example.basic.yunbyeongchang.unitfifteen;

import java.util.*;

public class ListExample {
    //var

    //method
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice");

        for(String name:names) {
            System.out.println(name);
        }
    }
}

//순서 유지
//중복 허용
//인덱스 접근 가능