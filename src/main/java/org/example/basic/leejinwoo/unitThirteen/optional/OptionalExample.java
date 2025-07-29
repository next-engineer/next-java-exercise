package org.example.basic.leejinwoo.unitThirteen.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Carrot");

        System.out.println(name.isPresent());
        System.out.println(name.get());
        System.out.println(name.orElse("default"));
    }
}
