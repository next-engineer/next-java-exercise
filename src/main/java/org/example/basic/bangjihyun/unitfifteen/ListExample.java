package org.example.basic.bangjihyun.unitfifteen;

import java.util.*;

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
