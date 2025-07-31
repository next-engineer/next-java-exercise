package org.example.basic.gojunho.unitfifteen;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String,Integer> scores = new HashMap<>();
        scores.put("Kim",90);
        scores.put("Lee",85);
        scores.put("Kim",95);

        for (String name : scores.keySet()){
            System.out.println(name + "의 점수:" +scores.get(name));
        }
    }
}
