package org.example.basic.leehyemin.unitten.util;

public class Util {
    public static <T> void printAll(T[] arr) {
        for (T element : arr) {
            System.out.print(element+" ");
        }

        System.out.println();
    }
}
