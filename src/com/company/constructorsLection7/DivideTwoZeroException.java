package com.company.constructorsLection7;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DivideTwoZeroException {
    //how to handle correctly the exception if entered is a
    public static void main(String[] args) throws InputMismatchException {
        Scanner myInput = new Scanner(System.in);
        int x, y;

        System.out.println("Enter X ");
        x = myInput.nextInt();
        System.out.println("Enter Y");
        y = myInput.nextInt();

        try {
            System.out.println("X/Y= " + x / y);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invalid value of Y=0 - /0 not allowed");
        }


    }

}


