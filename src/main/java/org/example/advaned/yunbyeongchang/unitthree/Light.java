package org.example.advaned.yunbyeongchang.unitthree;

public class Light implements PowerControllable{
    //var

    //method
    @Override
    public void turnOn()
    {
        System.out.println("조명을 켭니다.");
    }

    @Override
    public void turnOff()
    {
        System.out.println("조명을 끕니다.");
    }
}
