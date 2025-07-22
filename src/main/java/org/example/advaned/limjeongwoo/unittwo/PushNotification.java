package org.example.advaned.limjeongwoo.unittwo;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Push");
    }
}
