package com.company.constructorsLection7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1DividebyZero {
    public static void main(String[] args) {
        Scanner myEntry = new Scanner(System.in);
        int x, y;

        try {
            System.out.println("Enter X and Y values:");
            //System.out.println("Enter Y value:");
            if (myEntry.hasNextInt()) {
                x = myEntry.nextInt();
                y = myEntry.nextInt();
                System.out.println("X/Y= " + x / y);
            }
        }
        catch (InputMismatchException e2) {
            System.out.println("Invalid value has been entered");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Enter a valid number for X or Y");
        }
        catch (ArithmeticException e1) {
            System.out.println("Y should be different than 0");
        }
    }
}
