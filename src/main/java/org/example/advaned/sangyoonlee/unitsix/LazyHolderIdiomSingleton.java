package org.example.advaned.sangyoonlee.unitsix;

public class LazyHolderIdiomSingleton {
    private LazyHolderIdiomSingleton() {}

    private static class Holder {
        private static final LazyHolderIdiomSingleton INSTANCE = new LazyHolderIdiomSingleton();
    }

    public static LazyHolderIdiomSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
