package org.example.advaned.yunbyeongchang.unitfive.example;

class SmsService implements MessageService {
    //method
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
