package org.example.basic.kimaram.unitten.wildcard;

import java.util.List;

// 3. 와일드 카드 연습(?, extends, super)
public class AnimalPrinter {
    public static void printAnimalList(List<? extends Animal> list) {
        for (Animal a : list) {
            a.sound();
        }
    }
}
