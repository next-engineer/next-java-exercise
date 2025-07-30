package org.example.advaned.kimaram.unittwelve;

public class Main {
    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        controlTV(samsung, 7);

        TV lg = new LGTV();
        controlTV(lg, 10);

        TV sony = new SonyTV();
        controlTV(sony, 27);
    }

    // 리모컨 제어 메서드
    public static void controlTV(TV tv, int channel) {
        RemoteControl remote = new BasicRemote(tv);
        remote.turnOn();
        remote.setChannel(channel);
        remote.turnOff();

        System.out.println();
    }
}
