package org.example.advaned.gojunho.unitsix;

public class Main {
    public static void main(String[] args){
        Singleton4 a=Singleton4.getInstance();
        Singleton4 b=Singleton4.getInstance();

        System.out.println(a==b);
    }

}
