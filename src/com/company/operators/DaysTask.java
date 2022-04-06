package com.company.operators;

import java.util.Scanner;

public class DaysTask {
    public static void main(String[] args) {
        Scanner myInput=new Scanner(System.in);
        System.out.println("day number of the week");
        int day= myInput.nextInt();

        String dayOfTheWeekEnding=new String();
        String dayOfTheWeek= new String();

        boolean isValidDay=true;

        switch (day) {
            case 1 : //user input is the value of the case:
                dayOfTheWeekEnding="st";
                dayOfTheWeek="Monday";
                //System.out.println("day of the week is Monday");
                break;
            case 2:
                dayOfTheWeekEnding="nd";
                //System.out.println("day of the week is Monday");
                break;
            case 3:
                dayOfTheWeekEnding="rd";
                //System.out.println("day of the week is Monday");
                break;
            case 4: //add for all 7 days
                dayOfTheWeekEnding="th";
                //System.out.println("day of the week is Monday");
                break;
            default:
                System.out.println("This is not a valid day from the week");
                isValidDay=false;

        }
        if (isValidDay) {
            System.out.println("The " + day + "-" + dayOfTheWeekEnding + " day of the week is " + dayOfTheWeek);
        }
    }
}
