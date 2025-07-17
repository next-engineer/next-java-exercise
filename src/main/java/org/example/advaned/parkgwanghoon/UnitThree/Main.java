package org.example.advaned.parkgwanghoon.UnitThree;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SMSNotification());
        notifications.add(new PushNotification());

        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
