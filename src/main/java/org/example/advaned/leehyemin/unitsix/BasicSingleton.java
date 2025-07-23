package org.example.advaned.leehyemin.unitsix;

public class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton() {}

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
    public void pay(int amount) {
        System.out.println(amount+"원 결제 완료");
    }
}
