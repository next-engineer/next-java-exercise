package org.example.advaned.yunbyeongchang.unitfive.example;

public class Main {
    //method
    public static void main(String[] args)
    {
        Notification emailNotification = new Notification(new EmailService());
        Notification smsNotification = new Notification(new SmsService());

        emailNotification.alert("메세지가 도착했습니다.");
        smsNotification.alert("메세지가 도착했습니다.");
    }
}
