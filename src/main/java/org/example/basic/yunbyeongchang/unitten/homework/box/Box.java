package org.example.basic.yunbyeongchang.unitten.homework.box;

public class Box<T> {
    //var
    private T item;
    private T destination;

    //method
    public void setItem(T item) { this.item = item; }
    public void setDestination(T destination) { this.destination = destination; }

    public T getItem() { return item; }
    public T getDestination() { return destination; }

}
