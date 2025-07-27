package org.example.advaned.parkjoohyung.unitsix;

public class Synchronized {
    private static Synchronized instance;

    private Synchronized() {}

    public static synchronized Synchronized getInstance() {
        if (instance == null) {
            instance = new Synchronized();
        }
        return instance;
}
}
