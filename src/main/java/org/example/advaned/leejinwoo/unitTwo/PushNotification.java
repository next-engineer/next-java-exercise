package org.example.advaned.leejinwoo.unitTwo;

public class PushNotification {

    public static void main(String[] args) {
        notificationSender("email");
        notificationSender("sms");
    }

    public static void notificationSender(String push){
        if(push.equals("email")){
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send();
        }else if(push.equals("sms")){
            SMSNotification smsNotification = new SMSNotification();
            smsNotification.send();
        }
    }
}
