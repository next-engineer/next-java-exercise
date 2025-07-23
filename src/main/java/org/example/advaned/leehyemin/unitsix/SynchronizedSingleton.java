package org.example.advaned.leehyemin.unitsix;

//여러 스레드가 동시에 들어오지 못하도록 차단.
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
