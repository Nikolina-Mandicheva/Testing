package com.company.methodsLection6;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner myNumbers=new Scanner(System.in);
        System.out.println("Enter your number x:");
        int x=myNumbers.nextInt();
        System.out.println("Enter your number y:");
        int y=myNumbers.nextInt();

        if (isEvenN(x,y)) {
            System.out.println("Are given numbers equal? " + "Yes");
        }
        else System.out.println("Are given numbers equal? " + "No");
    }

    static boolean isEvenN(int x, int y){
        boolean isEven=false;
        if (x==y){
            isEven=true;
        }
        return isEven;
    }


}
