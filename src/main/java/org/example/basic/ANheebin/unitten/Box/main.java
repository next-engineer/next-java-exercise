package org.example.basic.ANheebin.unitten.Box;

public class main {
    public static void main(String[] args){
        Box<String> strinBox=new Box<>();
        strinBox.set("Hello");
        System.out.println(strinBox.get());

        Box<Integer> intBox=new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}