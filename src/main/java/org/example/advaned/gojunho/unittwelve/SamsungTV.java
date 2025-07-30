package org.example.advaned.gojunho.unittwelve;

public class SamsungTV implements TV{

        @Override
        public void turnOn() {
            System.out.println("Samsung TV 켜짐");
    }

        @Override
        public void turnOff() {
            System.out.println("Samsung TV 꺼짐");
    }

        @Override
        public void setChannel(int channel) {
            System.out.println("Samsung TV 채널:"+ channel);
    }

}
