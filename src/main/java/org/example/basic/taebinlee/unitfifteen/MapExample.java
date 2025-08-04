package org.example.basic.taebinlee.unitfifteen;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> scoreMap = createScoreMap();
        printScores(scoreMap);
    }

    private static Map<String, Integer> createScoreMap() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Kim", 95);
        return scores;
    }

    private static void printScores(Map<String, Integer> scores) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + "의 점수는 :" + entry.getValue());

        }
    }
}
