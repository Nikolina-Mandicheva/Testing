package com.company.array;

import java.util.Arrays;

public class ListLoop1 {
    public static void main(String[] args) {

        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int[] list2 = new int[list1.length];
        int j = 1;
        int i;

        for (i = 0; i <= list1.length - 1; i++) {
            int residue = list1[i] % 5;
            if (residue == 0) {
                list2[j] = list1[i];
                j++;
                 if (list2[j-1] > 150) {
                    break;
                    //180 will go into the new array, but it will break the For, hence 200 will not go thru the for?
                }
            }
        }
        //should convert the array in list,as I need only show not 0 values?

        System.out.println("Numbers divisible by 5 are: ");
        for (j = 0; j <= list2.length - 1; j++) {
            if (list2[j] != 0) {
                 System.out.print(list2[j] + "; ");
            }
        }

        System.out.println();
        }

    }
