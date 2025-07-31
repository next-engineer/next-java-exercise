package org.example.basic.leehyemin.unitfifteen;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");

        for(String name : names){
            System.out.println(name);
        }
    }
}
