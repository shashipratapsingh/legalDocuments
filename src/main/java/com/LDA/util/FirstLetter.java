package com.LDA.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstLetter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,2,5,2,6,7,8);
        Optional<Integer> s =  list.stream().findFirst();
        if (s.isPresent())
        {
            List<Integer> first=s.stream().toList();
            System.out.println(first);
        }else {
            System.err.println("No element found in the list; handling exception gracefully.");
        }


    }
}
