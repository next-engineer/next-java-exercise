package org.example.basic.yunbyeongchang.unitseven.example;

class Cat extends Animal {
    //method
    @Override                   // @Override는 부모의 동명 메서드보다 우선되어 실행
    void sound() {
        System.out.println("야옹!");
    }
}
