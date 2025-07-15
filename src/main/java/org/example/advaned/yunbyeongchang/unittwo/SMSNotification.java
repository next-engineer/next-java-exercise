package org.example.advaned.yunbyeongchang.unittwo;

public class SMSNotification extends Notification{
    //var

    //method
    public void send()
    {
        super.send();
        System.out.println("SMS 알림입니다.");
    }
}
