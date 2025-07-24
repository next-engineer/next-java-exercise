package org.example.advaned.leejinwoo.unitNine;

public class SMS implements Send{
    @Override
    public void send(String msg) {
        System.out.println("SMS Send : " + msg);
    }
}
