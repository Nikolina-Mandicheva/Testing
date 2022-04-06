package com.company.array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxItem {
    public static void main(String[] args) {


      ArrayMaxItem2();

        int[] array={1,2,3,45,4,5};
        int i;
        int max=array[0];


        for (i=1;i< array.length; i++)
        {
            if (array[i]>=max){
                max=array[i];
            }
            }
         System.out.println("Max array item is "+ max);
        }

       static void ArrayMaxItem2 (){
        // source: https://www.geeksforgeeks.org/find-max-min-value-array-primitives-using-java/
           // difference between int and Integer is?
           // Note: If you use type int while declaring the array you will end up seeing this error: “no suitable method found for min(List<int[]>)”

       Integer[] array1={12,34,51,6,23,4};
     int max=Collections.max(Arrays.asList(array1));
           System.out.println("Max Array1 Item is: " + max);}

    }

