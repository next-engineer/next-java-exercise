package org.example.advaned.yunbyeongchang.unitsix;

public class LazyHolderSingleton {
    private LazyHolderSingleton() {}

    // 내부 클래스가 실제 싱글톤 인스턴스를 생성
    private static class Holder {
        private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}

//Lazy Holder Idiom Singleton
//가장 안전한 방식으로, 스레드 안전 / 지연 로딩/ 성능 우수(Synchronized 없음)