package org.example.basic.gojunho.unitten.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Dog> dogs= List.of(new Dog(),new Dog());
        List<Cat> cats=List.of(new Cat());

        AnimalPrinter.printAnimalList(cats);
        AnimalPrinter.printAnimalList(dogs);
    }
}
