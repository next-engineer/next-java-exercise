package org.example.basic.kimyoungji.unitten.genericwildcards;

import java.util.List;

public class AnimalPrinterTest {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        AnimalPrinter.printAnimalList(dogs);
        AnimalPrinter.printAnimalList(cats);
    }
}