package org.example.advaned.gojunho.uniteight.Notification;

public class SMS implements Notification{
    @Override
    public void alert(String message) {
        System.out.println("(SMS 알림) "+message);
    }
}
