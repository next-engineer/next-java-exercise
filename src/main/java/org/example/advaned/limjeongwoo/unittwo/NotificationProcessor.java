package org.example.advaned.limjeongwoo.unittwo;

public class NotificationProcessor {

    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender(new SMSNotification());
        sender.sendNotification();
    }

}
