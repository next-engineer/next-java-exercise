package org.example.advaned.yunbyeongchang.unittwo;

public class Main {
    public static void main(String[] args)
    {
        Notification noti = new Notification();
        SMSNotification smsNoti = new SMSNotification();

        noti.send();
        smsNoti.send();
    }
}
