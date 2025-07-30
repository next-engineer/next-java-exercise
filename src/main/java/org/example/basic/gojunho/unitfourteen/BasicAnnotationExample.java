package org.example.basic.gojunho.unitfourteen;

public class BasicAnnotationExample {

    public void oldMethod(){
        System.out.println("This method is deprecated");
    }

    public String toString(){
        return "BasicAnnotationExample";
    }

    public static void main(String[] args){
        new BasicAnnotationExample().oldMethod();
    }
}
