package org.example.basic.taebinlee.unitfifteen;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> nameList = createNamelist();
        printNames(nameList);
    }

    private static List<String> createNamelist() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        return names;
    }

    private static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}