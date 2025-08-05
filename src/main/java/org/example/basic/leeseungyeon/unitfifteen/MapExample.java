package org.example.basic.leeseungyeon.unitfifteen;

import java.util.*;

public class MapExample {
    public void run() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Kim", 95); // 값 덮어쓰기

        System.out.println("Map 출력:");
        for (String name : scores.keySet()) {
            System.out.println(name + "의 점수: " + scores.get(name));
        }
    }
}