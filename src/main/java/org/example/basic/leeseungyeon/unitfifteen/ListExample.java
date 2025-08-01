package org.example.basic.leeseungyeon.unitfifteen;

import java.util.*;

public class ListExample {
    public void run() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // 중복 허용

        System.out.println("List 출력:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}