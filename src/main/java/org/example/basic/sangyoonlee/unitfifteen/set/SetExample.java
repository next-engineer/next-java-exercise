package org.example.basic.sangyoonlee.unitfifteen.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
