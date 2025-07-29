package org.example.advaned.kimaram.unitsix;

// Double-Checked Locking 방식 : 장점은 성능과 스레드 안정성 모두 확보
// volatile 키워드의 의미 : JVM이 인스턴스 생성을 중간 단계에서 다른 스레드에 노출하지 않도록 보장
public class DoubleSingleton {
    private static volatile DoubleSingleton instance;

    private DoubleSingleton() {}

    public static DoubleSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleSingleton.class) {
                if (instance == null) {
                    instance = new DoubleSingleton();
                }
            }
        }
        return instance;
    }
}
