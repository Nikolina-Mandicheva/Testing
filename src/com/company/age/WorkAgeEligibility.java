package com.company.age;

import java.util.Scanner;

public class WorkAgeEligibility {
    public static void main(String[] args) {
        Scanner myAge = new Scanner(System.in);
        System.out.println("Please type in your age");
        byte age = myAge.nextByte();

        if (age <= 0) {
            System.out.println("Invalid age value");
            //How to make it to loop the entered age again if invalid value, so to go thru checks again
        } else {
            if (age < 16 || age >= 65) {
                System.out.println("You are not eligible to work");
            } else {
                System.out.println("You are eligible to work");
            }
        }

    }


    }
