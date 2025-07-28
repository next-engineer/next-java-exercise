package org.example.basic.kimyoungji.uniteleven;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("과일 목록: " + fruits.get(0));

        fruits.remove("Banana");
        fruits.add(1, "Mango");

        System.out.println("수정된 목록: " + fruits);
        System.out.println("첫 번째 과일: " + fruits.get(0));

        //(숙제) for 문으로 조회도 추가
    }
}
