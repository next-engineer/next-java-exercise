package org.example.advaned.yunbyeongchang.unitsix;

public class NormalSingleton {
    //var
    private static NormalSingleton instance;

    //method
    // 생성자를 private으로 제한
    private NormalSingleton() {}

    // 정적 메서드를 통해 인스턴스 제공
    public static NormalSingleton getInstance() {
        if (instance == null) {
            instance = new NormalSingleton();
        }
        return instance;
    }
}

//Lazy Initialization 싱글톤
//멀티스레드 환경에서는 instance가 중복될 수 있음
