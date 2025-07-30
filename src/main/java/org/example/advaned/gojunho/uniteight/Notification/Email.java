package org.example.advaned.gojunho.uniteight.Notification;

public class Email implements Notification{
    @Override
    public void alert(String message) {
        System.out.println("(이메일 알림) "+message);
    }
}
