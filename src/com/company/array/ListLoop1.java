package com.company.array;

import java.util.Arrays;

public class ListLoop1 {
    public static void main(String[] args) {

        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int[] list2 = new int[list1.length];
        int j = 0;
        int i;

        for (i = 0; i < list1.length - 1; i++) {
            int residue = list1[i] % 5;
            if (residue == 0) {
                list2[j] = list1[i];
                j++;
                if (list2[j] > 150) {
                    break;
                }
            }
        }

            for (j = 0; j < list2.length - 1; j++) {
                System.out.println("Numbers divisible by 5 are: " + list2[j] + "; ");
            }


        }

    }
