package org.example.advaned.yunbyeongchang.unitthree;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        Light light = new Light();
        AirConditioner airconditioner = new AirConditioner();
        SmartSpeaker speaker = new SmartSpeaker();

        light.turnOn(); light.turnOff();

        System.out.println("---------------------");
        airconditioner.turnOn();   airconditioner.setTemperature(24);
        airconditioner.turnOff();

        System.out.println("---------------------");
        speaker.turnOn();   speaker.playMusic("노래");   speaker.turnOff();
    }

}
