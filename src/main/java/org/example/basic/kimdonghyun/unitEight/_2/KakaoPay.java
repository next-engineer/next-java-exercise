package org.example.basic.kimdonghyun.unitEight._2;

class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
