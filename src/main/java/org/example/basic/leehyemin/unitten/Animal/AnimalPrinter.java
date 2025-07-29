package org.example.basic.leehyemin.unitten.Animal;

import java.util.List;

public class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

}
