package com.company.methodsLection6;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {

        Scanner myEntry=new Scanner(System.in);
        System.out.println("Enter a string");
        String myString=myEntry.nextLine();
        System.out.println("The word count is: "+countString(myString));

    }

    static int countString(String myString){
        //char[] ch=myString.toCharArray();
        int wordCount=0;
        boolean word=false;
        int endOfLine=myString.length()-1;


        for (int i=0; i< myString.length();i++) {

            // if the char is a letter, then word=true
            if(Character.isLetter(myString.charAt(i) ) && (i!=endOfLine)){
                word=true;
            }
            else {
            //if the char is not a letter and there have been letters before, counter ++
                if   (!Character.isLetter(myString.charAt(i) ) && (word)){
                 wordCount++;
                 word=false;
                }
                else //last word of the string,if it does not end with non-letter. it wouldn't count without it?
                    if (Character.isLetter(myString.charAt(i) ) && (i==endOfLine)) {
                    wordCount++;
                }
            }

        }

        return wordCount;
    }
}
