package com.CSLA.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumAllElements {

    public static void main(String[] args){
        List<Integer> name= Arrays.asList(1,1,1,1);
        int sum= name.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
