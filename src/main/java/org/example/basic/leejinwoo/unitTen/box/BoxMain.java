package org.example.basic.leejinwoo.unitTen.box;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
