package org.example.basic.taeyeon.unitfifteen;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple"); // 중복 무시

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
class MapExample {
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

