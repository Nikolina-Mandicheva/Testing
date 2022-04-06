package com.company.operators;

import java.util.Scanner;

public class DaysTask {
    public static void main(String[] args) {
        System.out.println();
        Scanner myInput=new Scanner(System.in);
        System.out.println("day number of the week");
        int dayNumber= myInput.nextInt();

        String dayOfTheWeekEnding=new String();
        String dayOfTheWeekName= new String();

        boolean isValidDay=true;

        switch (dayNumber) {
            case 1 : //user input is the value of the case:
                dayOfTheWeekEnding="st";
                dayOfTheWeekName="Monday";
                //System.out.println("day of the week is Monday");
                break;
            case 2:
                dayOfTheWeekEnding="nd";
                dayOfTheWeekName="Tuesday";
                //System.out.println("day of the week is Tuesday");
                break;
            case 3:
                dayOfTheWeekEnding="rd";
                dayOfTheWeekName="Wednesday";
                //System.out.println("day of the week is Wednesday");
                break;
            case 4:
                dayOfTheWeekEnding="th";
                dayOfTheWeekName="Thursday";
                //System.out.println("day of the week is Thursday");
                break;
            case 5:
                dayOfTheWeekEnding="th";
                dayOfTheWeekName="Friday";
                //System.out.println("day of the week is Friday");
                break;
            case 6:
                dayOfTheWeekEnding="th";
                dayOfTheWeekName="Saturday";
                //System.out.println("day of the week is Saturday");
                break;
            case 7:
                dayOfTheWeekEnding="th";
                dayOfTheWeekName="Sunday";
                //System.out.println("day of the week is Sunday");
                break;
            default:
                System.out.println("This is not a valid day from the week");
                isValidDay=false;

        }
        if (isValidDay) {
            System.out.println("The " + dayNumber + "-" + dayOfTheWeekEnding + " day of the week is " + dayOfTheWeekName);
        }
    }
}
