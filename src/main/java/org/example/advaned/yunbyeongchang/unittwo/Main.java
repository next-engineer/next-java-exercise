package org.example.advaned.yunbyeongchang.unittwo;

public class Main {
    public static void main(String[] args)
    {
        SMSNotification smsNoti = new SMSNotification();
        EMailNotification emailNoti = new EMailNotification();

        smsNoti.send();
        emailNoti.send();
    }
}
