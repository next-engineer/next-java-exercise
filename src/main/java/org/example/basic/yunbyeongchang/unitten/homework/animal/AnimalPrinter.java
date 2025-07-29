package org.example.basic.yunbyeongchang.unitten.homework.animal;

import java.util.*;

public class AnimalPrinter {
    public static <T> void printSound(List<? extends Animal> animals)
    {
        for(Animal animal: animals)
            animal.sound();
    }
}
