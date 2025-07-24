package org.example.basic.bangjihyun.unitten.Box;

public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get()); // Hello

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get()); //123
    }
}
