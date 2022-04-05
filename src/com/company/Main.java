package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        introduceYourself();
        trianglePerimeter();
        triangleSurface();
        trianglePerimeterTuned();
        triangleSurfaceTuned();
    }
    static void introduceYourself(){
        //Show my name
        String firstName= new String("Nikolina");
        String middleName= new String("Dimitrova");
        String lastName= new String("Mandicheva");
        System.out.println("My full name is: " + firstName + " " + middleName + " " + lastName);
    }

    static void trianglePerimeter() {
        double aSide=13.4;
        double bSide=4.9;
        double cSide=15.1;
        double P=aSide+bSide+cSide;
        System.out.println("The Triangle Perimeter is:" + P+"sm");

    }

    static void trianglePerimeterTuned(){
        Scanner myInput=new Scanner(System.in);
        System.out.println("Enter A side value:");
        double sideA= myInput.nextDouble();
        System.out.println("Your entered value for A side is:" + sideA+"sm");
        System.out.println();
        System.out.println("Enter B side value:");
        double sideB= myInput.nextDouble();
        System.out.println("Your entered value for B side is:" + sideB+"sm");
        System.out.println();
        System.out.println("Enter C side value:");
        double sideC= myInput.nextDouble();
        System.out.println("Your entered value for C side is:" + sideC+"sm");
        System.out.println();
        double P=sideA+sideB+sideC;
        System.out.println("The Triangle Perimeter is:" + P + "sm");
    }


    static void triangleSurface() {
        double aSide=3;
        double bSide=4;
        double cSide=5;
        double S=aSide*bSide/2;
        System.out.println("The Triangle surface is:" +S+"sm2");

    }

    static void triangleSurfaceTuned(){
        Scanner myInput=new Scanner(System.in);
        System.out.println("Enter A side value:");
        double sideA= myInput.nextDouble();
        System.out.println("Your entered value for A side is:" + sideA+"sm");
        System.out.println();
        System.out.println("Enter B side value:");
        double sideB= myInput.nextDouble();
        System.out.println("Your entered value for B side is:" + sideB+"sm");
        System.out.println();
        System.out.println("Enter C side value:");
        double sideC= myInput.nextDouble();
        System.out.println("Your entered value for C side is:" + sideC+"sm");
        System.out.println();
        double S=sideA*sideB/2;
        System.out.println("The Triangle surface is:" +S+"sm2");
    }


}


