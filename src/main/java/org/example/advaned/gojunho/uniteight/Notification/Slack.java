package org.example.advaned.gojunho.uniteight.Notification;

public class Slack implements Notification{
    @Override
    public void alert(String message) {
        System.out.println("(slack 알림) "+message);
    }
}
