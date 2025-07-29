package org.example.basic.yunbyeongchang.unitthirteen.optional;

import java.util.Optional;

public class OptionalExample {
    //var

    //method
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Carrot");

        System.out.println(name.isPresent());                   // name이 현재 존재하는가?(true)
        System.out.println(name.get());                         // 현재 name 값(Carrot)
        System.out.println(name.orElse("default"));       // name에 값이 없을 경우 "default" 출력(Carrot)

        //Safe Check
        String var = null;
        Optional<String> optionalVar = Optional.ofNullable(var);   // null 값이라도 들어가도록

        String result = optionalVar.orElse("기본 값");
        System.out.println("현재 값: " + result);                  // 현재 값: 기본 값

    }
}
