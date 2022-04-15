package com.company.methodsLection6;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {



        Scanner myEntry= new Scanner(System.in);
        System.out.println("Enter array length");
        int n= myEntry.nextInt();
        double[] array=new double[n];
        for (int i=0;i<=n-1;i++) {
            System.out.println("Enter array values:");
            array[i] = myEntry.nextDouble();
        }
        System.out.println("Array sum is: "+sumArray(array));;


    }

     static double sumArray(double[] array){
        int i;
        double sum = 0;
        for(i=0; i< array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }




}
