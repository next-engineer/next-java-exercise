package org.example.basic.leejinwoo.unitTen.animal;

import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        AnimalPrinter.printAnimalList(dogs);
        AnimalPrinter.printAnimalList(cats);
    }

    public static class AnimalPrinter {
        public static void printAnimalList(List<? extends Animal> list) {
            for (Animal a : list) {
                a.sound();
            }
        }
    }
}
