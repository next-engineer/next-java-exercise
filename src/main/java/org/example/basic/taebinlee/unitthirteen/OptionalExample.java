package org.example.basic.taebinlee.unitthirteen;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Carrot");

        System.out.println(name.isPresent());
    // true
        System.out.println(name.get());
    // Carrot
        System.out.println(name.orElse("default"));
    }
}
