package org.example.advaned.leehyemin.unittwo;

public class NotificationApp {
    public static void main(String[] args) {
        Email email = new Email();
        email.send();

        SMS sms = new SMS();
        sms.send();

        Push push = new Push();
        push.send();
    }
}
