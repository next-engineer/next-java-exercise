package org.example.basic.leeseungyeon.unitfifteen;

import java.util.*;

public class SetExample {
    public void run() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple"); // 중복 무시

        System.out.println("Set 출력:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}