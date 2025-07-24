package org.example.basic.kimaram.unitten.box;

// 1. 제네릭 클래스 연습 : T라는 타입 매개변수를 갖는 클래스 만들고 다양한 타입 넣기
public class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
