package com.company.operators;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner mySnanner=new Scanner(System.in);
        System.out.println("Enter value for angle A: ");
        int angleA= mySnanner.nextInt();
        System.out.println("Enter value for angle Б: ");
        int angleB= mySnanner.nextInt();
        System.out.println("Enter value for angle C: ");
        int angleC= mySnanner.nextInt();


        if (angleA<=0 || angleC<=0 || angleB<=0 ) {
            System.out.println("Invalid triangle");
        }
        else {
            // check if the angle sum is valid

        if  (angleA+angleC+angleB !=180) {
            System.out.println("This is not a valid triangle");
        }
        else {
            System.out.println("This is invalid ");
        }

        }
    }
}
