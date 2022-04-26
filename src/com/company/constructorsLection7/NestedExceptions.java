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
            notTrow();
        } catch (ArithmeticException e) {
            System.out.println("Caught!");
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Println after try-catch");

    }
}
