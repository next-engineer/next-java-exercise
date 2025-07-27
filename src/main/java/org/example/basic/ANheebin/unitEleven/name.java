package org.example.basic.ANheebin.unitEleven;

import java.util.ArrayList;
import java.util.List;

public class name {
    public static void main(String[] args) {
        List<String> namelist=new ArrayList<>();

        namelist.add("Alice");
        namelist.add("Bob");
        namelist.add("Charlie");
        namelist.add("David");
        namelist.add("Eve");

        namelist.remove("Charlie");

        for (String name : namelist) {
            System.out.println(name);
        }
        System.out.println("인덱스 1번: " + namelist.get(1));
    }
}