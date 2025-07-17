package org.example.basic.leehyemin.unitfour.SmartHome;

public class MusicPlay implements MusicPlayable {
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void nextSong() {
        System.out.println("Next song");
    }

    @Override
    public void previousSong() {
        System.out.println("Previous song");
    }
}
