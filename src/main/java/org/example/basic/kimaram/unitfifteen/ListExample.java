package org.example.basic.kimaram.unitfifteen;

import java.util.ArrayList;
import java.util.List;

// List : 순서 유지, 인덱스 접근 가능, 중복 허용
// ArrayList : 동적 배열, 빠른 조회
public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
