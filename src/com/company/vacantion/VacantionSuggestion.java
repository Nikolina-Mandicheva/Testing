package com.company.vacantion;

import java.util.Scanner;

public class VacantionSuggestion {
    public static void main(String[] args) {
        Scanner myEntry = new Scanner(System.in);
        System.out.println("Enter preferable destination Mountain or Beach");
        String destination = myEntry.next();

        switch (destination){
            case "Beach": {
                System.out.println("Enter the allowed Budget per day for a person");
                int budget=myEntry.nextInt();
                if (budget<=0) {
                    System.out.println("This is not allowed budget");
                }
                else {
                    if (budget<50){
                        System.out.println("Your should visit the Bulgarian Black Sea");
                    }
                    else {
                        System.out.println("Your should visit destinations outside Bulgaria");
                    }
                }
                break;
            }
            case "Mountain": {
                System.out.println("Enter the allowed Budget per day for a person");
                int budget=myEntry.nextInt();
                if (budget<=0) {
                    System.out.println("This is not allowed budget");
                }
                else {
                    if (budget<30){
                        System.out.println("Your should visit the Bulgarian Mountains ");
                    }
                    else {
                        System.out.println("Your should visit destinations outside Bulgaria");
                    }
                }
                break;
            }
            default:
                System.out.println("There is no information about this entry");
                break;
        }
    }
}