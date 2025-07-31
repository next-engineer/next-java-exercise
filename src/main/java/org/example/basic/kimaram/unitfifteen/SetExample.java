package org.example.basic.kimaram.unitfifteen;

import java.util.HashSet;
import java.util.Set;

// Set : 중복 데이터 저장 불가
// HashSet : 해시 기반, 빠른 검색
public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");    // 중복 무시

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
