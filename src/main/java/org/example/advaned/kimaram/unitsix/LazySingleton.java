package org.example.advaned.kimaram.unitsix;

// 기본 Singleton 구현 (Lazy Initialization : 멀티스레드 환경에서는 instance가 중복 생성 가능)
public class LazySingleton {
    private static LazySingleton instance;

    // 생성자를 private로 제한
    private LazySingleton() {}

    // 정적 메서드를 통해 인스턴스 제공
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
