package com.LDA.util;

import java.util.Arrays;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 3, 4, 5, 6, 7);

        // Calculate the average
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(avg -> System.out.println("Average: " + avg));
    }
}