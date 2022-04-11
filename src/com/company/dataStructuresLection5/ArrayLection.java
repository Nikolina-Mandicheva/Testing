package com.company.dataStructuresLection5;

import java.util.Scanner;

public class ArrayLection {
    public static void main(String[] args) {
        int i, j;
        Scanner myEntry = new Scanner(System.in);


        int[][] a = new int[4][3];
        /*a[0][0]=1;
        a[0][1]=11;
        a[0][2]=12;
        a[1][0]=10;
        a[1][1]=2;
        a[1][2]=3;
        a[2][0]=3;
        a[2][1]=31;
        a[2][2]=32;
        a[3][0]=4;
        a[3][1]=41;
        a[3][2]=42;*/

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.println("Enter value for row" + i +" column"+j);
                a[i][j] = myEntry.nextInt();
                //System.out.println("entered value" + a[i][j]);
            }
        }
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.println("array values on row"+i+" is: "+ a[i][j]);
            }
        }
    }
}

