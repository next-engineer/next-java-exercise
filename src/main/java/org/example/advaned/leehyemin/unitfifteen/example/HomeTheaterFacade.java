package org.example.advaned.leehyemin.unitfifteen.example;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Projectoer projector;
    private DVDPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, Projectoer projector, DVDPlayer dvd) {
        this.amp = amp;
        this.projector = projector;
        this.dvd = dvd;
    }

    public void watchMovie() {
        System.out.println("=== 영화 보기 시작 ===");
        amp.on();
        projector.on();
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        System.out.println("=== 영화 보기 종료 ===");
        dvd.off();
        projector.off();
        amp.off();
    }
}
