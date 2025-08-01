package org.example.basic.bangjihyun.unitfifteen;

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

