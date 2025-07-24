package org.example.advaned.leejinwoo.unitNine;

public class SendMain {
    public static void main(String[] args) {
        SendFactory sendFactory = new MainFactory();
        sendFactory.process("hi", "slack");
    }
}
