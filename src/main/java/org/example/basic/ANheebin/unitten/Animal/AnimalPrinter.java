package org.example.basic.ANheebin.unitten.Animal;

import java.util.List;

public class AnimalPrinter {
    public static void printAnimalList(List< ? extends Animal> animals){
        for(Animal animal : animals){
            animal.sound();
        }
    }
}
