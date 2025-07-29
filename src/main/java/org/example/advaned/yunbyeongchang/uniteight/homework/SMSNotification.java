package org.example.advaned.yunbyeongchang.uniteight.homework;

public class SMSNotification implements Notification{
    //var

    //method
    public void notification(String message)
    {
        System.out.println("SMS 메세지가 도착했습니다. 내용: " + message);
    }
}
