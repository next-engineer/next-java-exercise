package org.example.advaned.parkjoohyung.unitsix;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance;

    // private 생성자: 외부에서 인스턴스 생성 방지
    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
