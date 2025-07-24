package org.example.basic.gojunho.unitten.Box;

public class Box<T> {
    private T item;

    public void set(T item){
        this.item=item;
    }

    public T get(){
        return item;
    }
}
