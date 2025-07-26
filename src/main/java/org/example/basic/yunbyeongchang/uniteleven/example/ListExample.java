package org.example.basic.yunbyeongchang.uniteleven.example;

import java.util.*;

public class ListExample {
    //var

    //method
    public static void main(String[] args)
    {
        // List는 Interface, ArrayList는 Class
        // List는 정의된 자료형이며, ArrayList는 List를 implement한 구현체
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("과일 목록: " + fruits);

        fruits.remove("Banana");
        fruits.add(1, "Mango");

        System.out.println("수정 목록: " + fruits);
        System.out.println("1번째 과일: " + fruits.get(1));

        //for를 사용해서 과일 출력
        for(String fruit: fruits)
        {
            System.out.println(fruits.indexOf(fruit) + "번째 과일: " + fruit);
        }

    }
}
