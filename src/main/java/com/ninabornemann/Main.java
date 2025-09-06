package com.ninabornemann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(5, 4, 7, -1, 12);

        // get all odd numbers, double, sort,
        List<Integer> filteredNums = numberList.stream()
            .filter(i -> i % 2 != 0)
                .map(i -> i * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNums);


        }
    }