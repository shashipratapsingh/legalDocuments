package com.LDA.util;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String args[]) {
        String str="Learn java Programming";

        HashMap<Character,Integer> charCountMap=new HashMap<>();
        char[] strArray=str.toCharArray();
        for(char c: strArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else {
                charCountMap.put(c,1);
            }
        }
        System.out.println("Duplicate Character in : "+ str);
        Set<Character> charInString = charCountMap.keySet();


        for (Character ch:charInString){
            if (charCountMap.get(ch)>1){
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }


    }
}
