package org.example.basic.leejinwoo.unitFifteen;

import java.util.HashSet;
import java.util.Set;

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
