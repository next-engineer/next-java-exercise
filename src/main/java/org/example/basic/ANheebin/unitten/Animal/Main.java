package main.java.org.example.basic.ANheebin.unitten.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<cat> cats = List.of(new cat());

        AnimalPrinter.printAnimalList(dogs);
        AnimalPrinter.printAnimalList(cats);
        
    }
}
