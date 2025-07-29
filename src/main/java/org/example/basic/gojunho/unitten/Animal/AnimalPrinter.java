package org.example.basic.gojunho.unitten.Animal;

import java.util.List;

public class AnimalPrinter {
    public static void printAnimalList(List<? extends Animal> list){
        for(Animal a: list){
            a.sound();
        }
    }
}
