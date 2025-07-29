package org.example.basic.leeseungyeon.unitsix;

import java.util.*;

public class LambdaExample2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Choi");

        // 문자열 길이 기준 정렬
        names.sort((a, b) -> a.length() - b.length());

        // 메서드 참조 방식 출력
        names.forEach(System.out::println);

        //Comparator (리스트 정렬)


    }
}