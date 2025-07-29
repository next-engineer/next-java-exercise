<<<<<<< HEAD:src/main/java/org/example/basic/ANheebin/unitsix/LambdaExample5.java
package org.example.basic.ANheebin.onepROJECT.unitsix;
=======
package org.example.basic.leeseungyeon.unitsix;
>>>>>>> fc078c1a9a60aeb6103d98986f332d29b32088d6:src/main/java/org/example/basic/leeseungyeon/unitsix/LambdaExample5.java

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class LambdaExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        Function<String, Integer> lengthFunction = s -> s.length();

        list.stream()
            .map(lengthFunction)
            .forEach(System.out::println); // 결과: 3, 3, 5
    }
}
