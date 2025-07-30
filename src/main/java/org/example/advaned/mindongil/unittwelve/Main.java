package org.example.advaned.mindongil.unittwelve;

public class Main {
    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        RemoteControl remote1 = new BasicRemote(samsung);

        remote1.turnOn();
        remote1.setChannel(7);
        remote1.turnOff();

        System.out.println();

        TV lg = new LGTV();
        RemoteControl remote2 = new BasicRemote(lg);

        remote2.turnOn();
        remote2.setChannel(10);
        remote2.turnOff();
    }
}
