package org.example.basic.gojunho.unitfive;

public class Main {
    public static void main(String args[]){

        Book book1 = new Book();
        book1.printInfo();

        Book book2 = new Book("해리포터","해리포터 아줌마");
        book2.printInfo();

        Book book3 = new Book("괴물","괴물 아저씨",5000);
        book3.printInfo();
    }
}
