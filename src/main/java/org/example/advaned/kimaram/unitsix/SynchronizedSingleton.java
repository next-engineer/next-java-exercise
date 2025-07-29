package org.example.advaned.kimaram.unitsix;

// 멀티 스레드 안전 Singleton (Synchronized) : 장점은 스레드 안전, 단점은 동기화 때문에 성능 저하 발생
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
