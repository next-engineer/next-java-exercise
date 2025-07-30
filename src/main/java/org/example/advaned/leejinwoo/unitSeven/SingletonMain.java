package org.example.advaned.leejinwoo.unitSeven;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a == b);  // true
    }
}
