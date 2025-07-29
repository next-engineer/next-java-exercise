package org.example.basic.yunbyeongchang.unitten.example.genericwildcard;

import java.util.*;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        Map<String, Integer> scores = new HashMap<>();

        names.add("ByeongChang");
        scores.put("ByeongChang", 50);

        System.out.println(names);
        System.out.println(scores);

    }
}
