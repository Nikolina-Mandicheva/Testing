package com.company.dataStructuresLection5;

import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;


public class ArrayDiagonals {
    public static void main(String[] args) {
        int i, j, sum = 0;
        Scanner myEntry = new Scanner(System.in);
        int[][] array = new int[4][4];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                System.out.println("Enter value for row" + i + " column" + j);
                array[i][j] = myEntry.nextInt();
            }
        }

       String lineEntry="";

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                lineEntry += Integer.toString(array[i][j])+ " ";
            }
            System.out.println(lineEntry);
            lineEntry="";
        }

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++){
                if (i==j){
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Array Diagonal Sum is:" +sum);


    }
}
