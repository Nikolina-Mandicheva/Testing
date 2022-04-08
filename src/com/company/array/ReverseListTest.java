package com.company.array;

public class ReverseListTest {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
         int i,x;
         int n=a.length;


        for (i=0;i< n/2;i++) {
            x=a[i];
            //x=10
            a[i]= a[n-i-1];
            //a[0]=a[4]=50; a[4] is empty
            a[n-i-1]=x;

        }
        System.out.println("Reversed Swapped Array is: ");
        for (i=0;i<n;i++){
            System.out.print(a[i]+"; ");
        }
        System.out.println();

    }
}


