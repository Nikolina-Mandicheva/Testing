package com.company.dataStructuresLection5;

import java.util.*;

public class ArrayMaxItem {
    public static void main(String[] args) {

// we already have this homework task in Lection 4 material - array package

        int i;
        Scanner myEntry = new Scanner(System.in);
       Integer [] a = new Integer[4]; //We need int to go to a String so to be able to work with list/collections

        //entering the array items
        for (i = 0; i <= (a.length-1); i++) {
               System.out.println("Enter value: ");
                a[i] = myEntry.nextInt();
        }

        List al=Arrays.asList(a);
        //System.out.println(al);

        int  max = (int) Collections.max(Arrays.asList(a));
       System.out.println("Max Array Item is: " + max);

        Collections.sort(al);
        //Why to change j to an Object? it was String
        //for (Object j: al) {
            //System.out.println(j);
                   // }
        for (int k=0; k< al.size();k++){
            System.out.println("Max ArrayList item is: " +al.get(k= al.size()-1));
        }


    }

}


