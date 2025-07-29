package org.example.basic.limjeongwoo.unitten.animal;

import java.util.List;

public class AnimalPrinter {
    public static void printAnimalList(List<? extends Animal> list) {
        for (Animal a : list) {
            a.sound();
        }
    }
}
