package org.example.basic.limjeongwoo.uniteight;

class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}