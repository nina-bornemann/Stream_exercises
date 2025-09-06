package com.ninabornemann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(5, 4, 7, -1, 12);

        // get all odd numbers, double, sort,
        List<Integer> filteredNums = numberList.stream()
                .filter(Main::isEven)
                .map(i -> i * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNums);

        // get sum of all
        int sumNum =numberList.stream()
                .reduce(0, Integer::sum);
        System.out.println(sumNum);

        // use forEach, ends the stream
        numberList.forEach(System.out::println);

        // collect
        List<Boolean> collected = numberList.stream()
                .map(i -> i % 2 == 0)
                .toList();
    }

    public static boolean isEven(Integer i) {
        return i % 2 == 0;
    }
}


