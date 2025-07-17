package org.example.advaned.parkjoohyung.unittfour;

public class  Light implements PowerControllable{

    @Override
    public void turnOn(){
        System.out.println("불이 켜졌습니다");
    }

    @Override
    public void turnOff(){
        System.out.println("불이 꺼졌습니다");
    }
}
