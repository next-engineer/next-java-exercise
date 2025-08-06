package org.example.advaned.leehyemin.unitfifteen.example;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projectoer projector = new Projectoer();
        DVDPlayer dvd = new DVDPlayer();

        HomeTheaterFacade theater = new HomeTheaterFacade(amp, projector, dvd);
        theater.watchMovie();
        theater.endMovie();
    }
}
