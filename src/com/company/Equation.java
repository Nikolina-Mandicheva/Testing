package com.company;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println();
        Scanner myObject =new Scanner(System.in);
        System.out.println("Type in your Quadratic Equation parameters:");
        System.out.println("Good examples are: [8;-30;7] or [1;-4;-5] or [1;-13;12] or [1;4;4]");
        System.out.println();
        System.out.println("Type in a parameter, different from 0 please:");
        float a=myObject.nextFloat();
        System.out.println("Type in b parameter:");
        float b=myObject.nextFloat();
        System.out.println("Type in c parameter:");
        float c=myObject.nextFloat();
        float D= (b*b) - (4*a*c);
        System.out.println("The Equation Discriminant is:" + D);
        double sqrtD=Math.sqrt(D);
        System.out.println("The Equation SQRT Discriminant is:" + sqrtD);
        System.out.println();
        double x1 = (-b + sqrtD) / (2 * a);
        System.out.println("Quadratic Equation Root x1 is:" + x1);
        double x2 = (-b - sqrtD) / (2 * a);
        System.out.println("Quadratic Equation Root x2 is:" + x2);



    }
}
