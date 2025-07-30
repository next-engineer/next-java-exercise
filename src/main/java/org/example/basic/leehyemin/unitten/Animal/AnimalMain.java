package org.example.basic.leehyemin.unitten.Animal;

import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        AnimalPrinter.printAnimals(dogs);
        AnimalPrinter.printAnimals(cats);
    }
}
