package org.example.advaned.gojunho.unittwo;

interface Notification {
    public void send();
}

 class EmailNotification implements Notification {
    public void send(){
        System.out.println("이메일 전송 완료");
    }
}

class SMSNotification implements Notification{
    public void send(){
        System.out.println("SMS알림");
    }
}

class PushNotification implements Notification{
    public void send(){
        System.out.println("Push알림");
    }
}