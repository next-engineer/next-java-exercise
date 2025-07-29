package org.example.advaned.yunbyeongchang.unitsix;

public class DoubleCheckSingleton {
    //var
    private static volatile DoubleCheckSingleton instance;

    //method
    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

//Double Checked Locking Singleton
//성능과 스레드 안전성을 동시 확보
//JVM이 Instance 생성을 중간 단계에서 다른 스레드에 노출하지 않도록 보장