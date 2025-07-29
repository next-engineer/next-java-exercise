package org.example.advaned.yunbyeongchang.unitsix;

public class SynchronizedSingleton {
    //var
    private static SynchronizedSingleton instance;

    //method
    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

//Synchronized Singleton
//멀티스레드 환경에서 안전하지만 동기화로 인한 성능 저하 발생 가능