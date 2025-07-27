<<<<<<< HEAD:src/main/java/org/example/basic/ANheebin/unitsix/LambdaExample4.java
package org.example.basic.ANheebin.onepROJECT.unitsix;
=======
package org.example.basic.leeseungyeon.unitsix;
>>>>>>> fc078c1a9a60aeb6103d98986f332d29b32088d6:src/main/java/org/example/basic/leeseungyeon/unitsix/LambdaExample4.java

import java.util.function.Predicate;    
import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        Predicate<String> startsWithA = s -> s.startsWith("a");

        names.stream()
            .filter(startsWithA)
            .forEach(System.out::println); // 결과: apple, avocado
    }
}
