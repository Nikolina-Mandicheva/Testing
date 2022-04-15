package com.company.methodsLection6;

public class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Smallest number of the given is: "+ findSmallest(5,1,4));
        System.out.println("Average of three numbers is: " + calculateAvg(3.2,5,1.8));

    }


    static int findSmallest(int a, int b, int c) {
        if(a<b && a<c) {
            return a;
        }
        if(b<a && b<c) {
            return b;
        }
        if(c<a && c<b) {
            return c;
        }
        return (a);
    }


    static double calculateAvg(double a, double b, double c){
        double sum;
         sum=(a+b+c)/3;
          return sum;

    }
}
