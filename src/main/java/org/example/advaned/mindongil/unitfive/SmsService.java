package org.example.advaned.mindongil.unitfive;

public class SmsService implements MessageService{
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
