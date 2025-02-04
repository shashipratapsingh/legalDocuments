package com.CSLA.util;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> list1= List.of(new String[]{"shashi", "pratap"});
        List<String> list2= List.of(new String[]{"Singh"});

        List<String> concatenate= new ArrayList<>(list1);

        concatenate.addAll(list2);



        System.out.println(concatenate);





    }
}
