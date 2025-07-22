package org.example.advaned.parkjoohyung.unitsix;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // 생성자는 private으로 선언하여 외부에서 생성할 수 없도록 함다다
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a singleton!");
    }

    public class Main {
    }
}
