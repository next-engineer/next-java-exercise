package org.example.advaned.yunbyeongchang.unitfifteen.example;

public class Main {
    //var

    //method
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        DVDPlayer dvd = new DVDPlayer();

        HomeTheaterFacade theater = new HomeTheaterFacade(amp, projector, dvd);
        theater.watchMovie();
        theater.endMovie();
    }
}
