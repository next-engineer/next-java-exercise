package org.example.basic.taeyeon.unitone;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class calulater {
        public static void main(String[] args) {
            // 1. BiFunction - 덧셈
            BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
            int sum = add.apply(5, 3);
            System.out.println("1. 5 + 3 = " + sum);

            // 2. Runnable - 쓰레드 실행
            Runnable r1 = () -> System.out.println("2. Thread 1 실행");
            r1.run();

            // 3. Comparator - 문자열 길이로 정렬
            List<String> names = Arrays.asList("Kim", "Lee", "Park", "Choi");
            names.sort((a, b) -> a.length() - b.length());
            System.out.println("3. 문자열 길이 기준 정렬: " + names);

            // 4. Consumer - 리스트 값 출력
            List<Integer> nums = Arrays.asList(10, 20, 30);
            Consumer<Integer> printNum = n -> System.out.println("4. 값: " + n);
            nums.forEach(printNum);

            // 5. Predicate - 'a'로 시작하는 문자열만 출력
            List<String> fruits = Arrays.asList("apple", "banana", "avocado", "grape");
            Predicate<String> startsWithA = s -> s.startsWith("a");
            System.out.print("5. 'a'로 시작하는 과일: ");
            fruits.stream().filter(startsWithA).forEach(s -> System.out.print(s + " "));
            System.out.println();

            // 6. Function - 문자열 길이 출력
            List<String> words = Arrays.asList("one", "two", "three");
            Function<String, Integer> lengthFunction = s -> s.length();
            System.out.print("6. 문자열 길이: ");
            words.stream().map(lengthFunction).forEach(len -> System.out.print(len + " "));
            System.out.println();
        }
    }

