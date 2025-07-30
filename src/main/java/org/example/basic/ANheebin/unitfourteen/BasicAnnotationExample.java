package org.example.basic.ANheebin.unitfourteen;

public class BasicAnnotationExample {
    
    @Deprecated
    public void oldMethod(){
        System.out.println("This is an old method");
    }

    @Override
    public String toString(){
        return"BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new BasicAnnotationExample().oldMethod();
    }
}
