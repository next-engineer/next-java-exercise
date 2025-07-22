package org.example.advaned.kimyoungji.unitsix;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Lazy Singleton]");
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());

        System.out.println("[Synchronized Singleton]");
        System.out.println(SynchronizedSingleton.getInstance() == SynchronizedSingleton.getInstance());

        System.out.println("[Double-Checked Singleton]");
        System.out.println(DoubleCheckedSingleton.getInstance() == DoubleCheckedSingleton.getInstance());

        System.out.println("[Holder Singleton]");
        System.out.println(HolderSingleton.getInstance() == HolderSingleton.getInstance());
    }
}
