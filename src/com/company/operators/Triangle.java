package com.company.operators;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner mySnanner = new Scanner(System.in);
        System.out.println("Enter value for angle A: ");
        int angleA = mySnanner.nextInt();
        System.out.println("Enter value for angle B: ");
        int angleB = mySnanner.nextInt();
        System.out.println("Enter value for angle C: ");
        int angleC = mySnanner.nextInt();


        if (angleA <= 0 || angleC <= 0 || angleB <= 0) {
            System.out.println("Invalid triangle");
                }
        else {
            // check if the angle sum is valid for a triangle

            if (angleA + angleC + angleB != 180) {
                System.out.println("These are not a valid triangle angles");
            } else {
                System.out.println("These are valid triangle angles ");

                if (angleA < 90 && angleC < 90 && angleB < 90) {
                    if (angleA == 60 && angleC == 60 && angleB == 60)
                        System.out.println("Triangle is acute and equilateral");

                    else {
                        System.out.println("Triangle is acute and is multifaceted");
                    }
                }

                if (angleA > 90 || angleC > 90 || angleB > 90) {
                    if (angleA < 90 || angleC < 90 || angleB < 90)
                        System.out.println("Triangle is obtuse and is multifaceted");
                } else {
                    if (angleA == 90 || angleC == 90 || angleB == 90) {
                        if ((angleA==45 && angleC==45) || (angleA==45 && angleB==45)||(angleB==45 && angleC==45)) {
                            System.out.println("Triangle is right-angled and is isosceles");}
                    else {
                        if (angleA < 90 || angleC < 90 || angleB < 90)
                            System.out.println("Triangle is right-angled and is multifaceted");

                                            }
                    }
                }
            }
        }
    }
}
