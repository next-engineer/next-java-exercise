package org.example.basic.bangjihyun.unitfifteen;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Kim", 95); // 기존 값 덮어씀

        for (String name : scores.keySet()) {
            System.out.println(name + "의 점수: " + scores.get(name));
        }
    }
}
