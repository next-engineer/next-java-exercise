package org.example.basic.leehyemin.unitfifteen;

import java.util.HashMap;
import java.util.Map;

//map : 중복 키 x
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 90);
        scores.put("Jane", 80);
        scores.put("John", 95);

        for(String name : scores.keySet()){
            System.out.println(name+"의 점수 : "+scores.get(name));
        }
    }
}
