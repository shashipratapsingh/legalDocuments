package com.CSLA.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StartWithSpecificCharector {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Smart","Banana","Anand","GO");

        List<String> stared=  list.stream().filter(s -> s.startsWith("g")).toList();



        System.out.println(stared);
    }
}
