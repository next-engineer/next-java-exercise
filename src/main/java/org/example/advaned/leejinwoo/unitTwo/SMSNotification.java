package org.example.advaned.leejinwoo.unitTwo;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("SMS 전송 완료");
    }

    public void smsNotificationSender(){
        send();
    }
}
