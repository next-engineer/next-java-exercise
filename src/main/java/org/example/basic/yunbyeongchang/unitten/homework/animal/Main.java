package org.example.basic.yunbyeongchang.unitten.homework.animal;

import java.util.*;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());
        List<? extends Animal> animals = dogs;

        AnimalPrinter.printSound(dogs);
        AnimalPrinter.printSound(cats);
        AnimalPrinter.printSound(animals);

    }
}
