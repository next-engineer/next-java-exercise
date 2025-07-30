package main.java.org.example.advaned.anheebin.unitsix;

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
