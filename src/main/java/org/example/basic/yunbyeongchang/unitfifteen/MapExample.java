package org.example.basic.yunbyeongchang.unitfifteen;

import java.util.*;

public class MapExample {
    //var

    //method
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Kim", 70);

        for(String name: scores.keySet()) {
            System.out.println(name + "의 점수: " + scores.get(name));
        }
    }
}

//key-value
//key는 중복 x, value는 중복 o
//HashMap->해시 기반, TreeMap->키 기준 정렬
