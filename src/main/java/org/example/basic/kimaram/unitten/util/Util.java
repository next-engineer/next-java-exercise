package org.example.basic.kimaram.unitten.util;

// 2. 제네릭 메서드 연습 : 타입에 관계없이 동작하는 메서드
public class Util {
    public static <T> void printAll(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
