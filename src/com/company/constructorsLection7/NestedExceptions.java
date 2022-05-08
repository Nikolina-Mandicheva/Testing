package com.company.constructorsLection7;

import javax.naming.PartialResultException;

public class NestedExceptions {
    static void throwIt() {
        System.out.println("Throw it!");
        throw new RuntimeException();
    }

    static void notTrow() {
        throwIt();
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            //notTrow();
            throw new IllegalArgumentException("This is not valid value");
        } catch (ArithmeticException e) {
            System.out.println("Caught!");
            e.printStackTrace();
        }
        catch (IllegalArgumentException e) {
            System.out.println("I got you and failed silently");
//            e.printStackTrace();
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Println after try-catch");

    }
}
