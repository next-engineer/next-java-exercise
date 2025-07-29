package org.example.basic.leeseungyeon.uniteleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
    private List<Integer> numbers;

    public NumberList() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int num) {
        numbers.add(num);
    }

    public int getMax() {
        if (numbers.isEmpty()) return Integer.MIN_VALUE;
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public int getMin() {
        if (numbers.isEmpty()) return Integer.MAX_VALUE;
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public void printSorted() {
        List<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);

        System.out.print("정렬된 리스트: [");
        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i));
            if (i != sorted.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        NumberList numList = new NumberList();

        int[] input = {5, 3, 8, 2, 9, 1, 6, 7, 4, 0};
        for (int i = 0; i < input.length; i++) {
            numList.addNumber(input[i]);
        }

        System.out.println("최대값: " + numList.getMax() + ", 최소값: " + numList.getMin());
        numList.printSorted();
    }
}
