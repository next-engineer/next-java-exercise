<<<<<<< HEAD:src/main/java/org/example/basic/ANheebin/unitsix/LambdaExample3.java
package org.example.basic.ANheebin.onepROJECT.unitsix;
=======
package org.example.basic.leeseungyeon.unitsix;
>>>>>>> fc078c1a9a60aeb6103d98986f332d29b32088d6:src/main/java/org/example/basic/leeseungyeon/unitsix/LambdaExample3.java

import java.util.*;
import java.util.function.Consumer;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(10, 20, 30);

        Consumer<Integer> printNum = n -> System.out.println("값: " + n);

        nums.forEach(printNum);
    
}
}
