package org.example.advaned.sangyoonlee.unitsix;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton lazy1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazy2 = LazyInitializedSingleton.getInstance();
        System.out.println("[Lazy] Same instance: " + (lazy1 == lazy2));

        SynchronizedSingleton sync1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton sync2 = SynchronizedSingleton.getInstance();
        System.out.println("[Synchronized] Same instance: " + (sync1 == sync2));

        DoubleCheckedLockingSingleton double1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton double2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("[Double Checked] Same instance: " + (double1 == double2));

        LazyHolderIdiomSingleton holder1 = LazyHolderIdiomSingleton.getInstance();
        LazyHolderIdiomSingleton holder2 = LazyHolderIdiomSingleton.getInstance();
        System.out.println("[Lazy Holder] Same instance: " + (holder1 == holder2));
    }
}
