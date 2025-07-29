package org.example.advaned.kimaram.unitsix;

// 내부 정적 클래스 사용 (Lazy Holder Idiom) : 장점은 스레드 안전, 지연 로딩, 성능 우수
public class HolderSingleton {
    private HolderSingleton () {}

    // 내부 클래스가 실제 싱글톤 인스턴스를 생성
    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
