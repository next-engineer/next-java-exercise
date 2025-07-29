package org.example.advaned.leehyemin.unitsix;

//getInstance()를 호출하면 Instance가 생성됨. 자원 절약 가능
public class LazySingleton {
    private LazySingleton() {}

    private static class Holder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return Holder.INSTANCE;
    }
}
