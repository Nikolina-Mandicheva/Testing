package com.company.array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxItem {
    public static void main(String[] args) {

        int[] array={1,2,3,45,4,5};
        int i;
        int max=array[0];


        for (i=1;i< array.length; i++)
        {
            if (array[i]>=max){
                max=array[i];
            }
            }
         System.out.println("max array item is "+ max);
        }

       // static void ArrayMaxItem2 (){
       // int[] array1={12,34,5,6,23,4};
        //int max=Collections.max(Arrays.asList(array1));

    }

