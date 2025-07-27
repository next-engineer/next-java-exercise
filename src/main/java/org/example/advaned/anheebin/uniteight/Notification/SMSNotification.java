package org.example.advaned.anheebin.uniteight.Notification;

public class SMSNotification implements Notification{

    @Override
    public void sendMessage(String Message) {
        System.out.println("SMS로 메시지 전송: " + Message);
    }
    
}
