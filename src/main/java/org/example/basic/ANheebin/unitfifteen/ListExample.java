package org.example.basic.ANheebin.unitfifteen;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String>names =new ArrayList<>();
        names.add("사과");
        names.add("밥밥");
        names.add("알리");

        for(String name:names){
            System.out.println(name);
        }
    }
    
}
