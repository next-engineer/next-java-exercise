package org.example.basic.taeyeon.unitten;

import main.java.org.example.basic.leeseungyeon.unitten.Util.Util;

import java.util.List;

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("야옹~");
    }
}

public class AnimalPrinter {
    public static void printAnimalList(List<? extends Animal> list) {
        for (Animal a : list) {
            a.sound();
        }
    }
}
class main {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        AnimalPrinter.printAnimalList(dogs);
        AnimalPrinter.printAnimalList(cats);
    }
}
interface Product {
    double getPrice();
}

class Book implements Product {
    public double getPrice() { return 12000.0; }
}

class Phone implements Product {
    public double getPrice() { return 999000.0; }
}

class PriceCalculator {
    public static <T extends Product> double calculateTotal(List<T> list) {
        double total = 0;
        for (T item : list) {
            total += item.getPrice();
        }
        return total;
    }
}