package org.example.advaned.leejinwoo.unitSeven;

public class Singleton {
//    private static Singleton instance;

    // 생성자를 private으로 제한
    private Singleton() {}

    // 정적 메서드를 통해 인스턴스 제공
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized(Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
