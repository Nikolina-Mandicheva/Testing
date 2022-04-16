package com.company.dataStructuresLection5;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        if  (isStringPalindrome("madam")){
            System.out.println("Is it String Palindrome? - Yes ");

        }
        else {
            System.out.println("Is it String Palindrome? - No ");
        }

    }
    static boolean isStringPalindrome(String myString){
        boolean isPalindrome=false;
        int j=myString.length()-1,i=0;
        myString=myString.toLowerCase(Locale.ROOT);
        System.out.println(myString);

        while (i<j){

                System.out.println(myString.toCharArray()[i] + " vs " + myString.toCharArray()[j]);
                if( myString.charAt(i)==myString.charAt(j)) {
                    isPalindrome = true;
                }
                    i++;
                    j--;

        }
        return isPalindrome;


    }


}
