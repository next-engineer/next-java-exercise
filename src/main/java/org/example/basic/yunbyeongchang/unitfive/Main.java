package org.example.basic.yunbyeongchang.unitfive;

public class Main {
    //method
    public static void main(String[] args)
    {
        Book book1 = new Book();
        Book book2 = new Book("책", "작가");
        Book book3 = new Book("책2", "작가2", 1000);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
