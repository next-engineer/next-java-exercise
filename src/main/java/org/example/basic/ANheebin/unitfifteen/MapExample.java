package org.example.basic.ANheebin.unitfifteen;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<>();
        names.put("kim", 90);
        names.put("LEE", 85);
        names.put("kim", 95);

        for (String name : names.keySet()){
            System.out.println(name + "의 점수: " + names.get(name));
        }
    }
    
}

