package com.company.methodsLection6;
import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {

        Scanner myEntry=new Scanner(System.in);
        System.out.println("Enter x number:");
        int x= myEntry.nextInt();

        if ((x<0)){
            System.out.println("Negative values are not expected");

        }
        else {
            if  (isIntPalindrome(x)){
                System.out.println("Is it Int Number Palindrome? - Yes ");

            }
            else {
                System.out.println("Is it String Number? - No ");
            }

        }
    }

    static boolean isIntPalindrome (int x){
    String str=Integer.toString(x);
        boolean isPalindrome=false;
        int j=str.length()-1,i=0;

        while (i<j){

            System.out.println(str.toCharArray()[i] + " vs " + str.toCharArray()[j]);
            if( str.charAt(i)==str.charAt(j)) {
                isPalindrome = true;
            }
            i++;
            j--;

        }
        return isPalindrome;

    }

}
