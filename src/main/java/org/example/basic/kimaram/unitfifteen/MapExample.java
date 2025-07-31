package org.example.basic.kimaram.unitfifteen;

import java.util.HashMap;
import java.util.Map;

// Map - 키-값 쌍 저장, 중복 키 X
// HashMap : 해시 기반, 가장 많이 사용
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Kim", 95);  // 기존 값 덮어씀

        for (String name : scores.keySet()) {
            System.out.println(name + "의 점수: " + scores.get(name));
        }
    }
}
