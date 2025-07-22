package org.example.advaned.parkjoohyung.unitsix;

public class main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a == b);  // true
    }
}
