package com.CSLA.practice;

import java.util.Arrays;

public class Practice {
    public static void main(String arr[])
    {
        int [] array1= {1,3,5,6,7,9};

        int [] array2= {2,4,6,7,8,10};

        int m1=array1.length;

        int m2=array2.length;

        int [] marging = new int[m1+m2];


        System.arraycopy(array1,0,marging,0,m1);

        System.arraycopy(array2, 0, marging, m1, m2);


        System.out.println(Arrays.toString(marging));
    }
}
