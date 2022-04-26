package com.company.Lection8OOP;

public class Practise {
    final int x=5;

    public static void printHello(){
        System.out.println("Hello. This method can be called Without creating object of class Practise");
    }

    public void printHelloOfObject (){
        System.out.println("Hello. This method can be called If you create an object of class Practise");
        System.out.println("Non static variables as x can be accessed Only by non-static object/methods");
        System.out.println("The values of x: " +this.x+ " The value of X is allowed to be accessed by method printHelloOfObject as it is non-static");
    }

    public static void main(String[] args) {
        printHello();
        System.out.println();
        Practise myObject=new Practise();
        myObject.printHelloOfObject();
    }
}
