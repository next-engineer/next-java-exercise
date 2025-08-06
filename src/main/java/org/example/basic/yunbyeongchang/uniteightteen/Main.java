package org.example.basic.yunbyeongchang.uniteightteen;

import java.util.Scanner;

public class Main {
    //method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeOrderManager manager = new CoffeeOrderManager(sc);
        manager.run();
        sc.close();
    }

}