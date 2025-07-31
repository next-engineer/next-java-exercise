package org.example.basic.ANheebin.unitfifteen;


import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String>names =new HashSet<>();
        names.add("사과");
        names.add("밥밥");
        names.add("사과");

        for(String name:names){
            System.out.println(name);
        }
    }
    
}

