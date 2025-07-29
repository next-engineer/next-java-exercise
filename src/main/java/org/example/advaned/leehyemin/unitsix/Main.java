package org.example.advaned.leehyemin.unitsix;

public class Main {
    public static void main(String[] args) {
        BasicSingleton system= BasicSingleton.getInstance();
        system.pay(5000);

        LazySingleton a = LazySingleton.getInstance();
        LazySingleton b = LazySingleton.getInstance();

        System.out.println(a == b);//항상 true

        SynchronizedSingleton c = SynchronizedSingleton.getInstance();
        SynchronizedSingleton d = SynchronizedSingleton.getInstance();
        System.out.println(c == d);

        DoubleCheckSingleton e = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton f = DoubleCheckSingleton.getInstance();
        System.out.println(e == f);
    }
}
