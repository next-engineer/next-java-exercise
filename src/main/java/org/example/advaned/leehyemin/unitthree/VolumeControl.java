package org.example.advaned.leehyemin.unitthree;

public class VolumeControl implements VolumeControllable {

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
}
