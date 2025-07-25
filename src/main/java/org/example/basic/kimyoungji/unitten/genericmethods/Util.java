package org.example.basic.kimyoungji.unitten.genericmethods;

public class Util {
    public static <T> void printAll(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}