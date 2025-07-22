package org.example.basic.yunbyeongchang.unitseven.example;

public class OverrideExample {
    public static void main(String[] args) {
        Animal a = new Cat(); // 업캐스팅
        a.sound(); // Cat의 오버라이딩된 메서드 호출됨
    }
}
