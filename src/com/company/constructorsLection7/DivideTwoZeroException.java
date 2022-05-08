package com.company.constructorsLection7;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DivideTwoZeroException {
    //how to handle correctly the exception if entered is a
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int x, y;


            System.out.println("Enter X ");
            if (myInput.hasNextInt()) {
                x = myInput.nextInt();
            } else {
                throw new IllegalArgumentException("Enter a valid number for X");

            }

            System.out.println("Enter Y ");
            if (myInput.hasNextInt()) {
                y = myInput.nextInt();
            } else {
                throw new IllegalArgumentException("Enter a valid number for Y");
            }


            if (y != 0) {
                System.out.println("X/Y= " + x / y);
            }
            else {
            throw new IllegalArgumentException("Y Input must be different than 0");
        }
        }

    }

