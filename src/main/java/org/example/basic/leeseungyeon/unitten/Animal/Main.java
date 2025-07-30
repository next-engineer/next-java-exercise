package org.example.basic.leeseungyeon.unitten.Animal;

import java.util.List;  // 이걸 추가하세요

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        AnimalPrinter.printAnimalList(dogs);
        AnimalPrinter.printAnimalList(cats);
    }
}