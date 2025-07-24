package org.example.basic.yunbyeongchang.unitten.example.genericclass;

public class Box<T> {
    //var
    private T item;

    //method
    public void set(T item)
    {
        this.item = item;
    }

    public T get() { return item; }
}
