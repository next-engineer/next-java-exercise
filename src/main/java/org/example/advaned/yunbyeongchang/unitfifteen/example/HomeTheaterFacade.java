package org.example.advaned.yunbyeongchang.unitfifteen.example;

public class HomeTheaterFacade {
    //var
    private Amplifier amp;
    private Projector projector;
    private DVDPlayer dvd;

    //method
    public HomeTheaterFacade(Amplifier amp, Projector projector, DVDPlayer dvd) {
        this.amp = amp;
        this.projector = projector;
        this.dvd = dvd;
    }

    public void watchMovie() {
        System.out.println("===영화 보기 시작===");
        amp.on();
        projector.on();
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        System.out.println("===영화 보기 종료===");
        projector.off();
        dvd.off();
        amp.off();
    }

}
