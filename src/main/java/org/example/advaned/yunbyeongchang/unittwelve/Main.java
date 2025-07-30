package org.example.advaned.yunbyeongchang.unittwelve;

import java.rmi.Remote;

public class Main {
    //var

    //method
    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        TV lg = new LGTV();

        RemoteControl samsungRemote = new BasicRemote(samsung);
        RemoteControl lgRemote = new BasicRemote(lg);

        samsungRemote.turnOn();
        samsungRemote.setChannel(11);
        samsungRemote.turnOff();

        System.out.println();

        lg.turnOn();
        lg.setChannel(7);
        lg.turnOff();

    }

}
