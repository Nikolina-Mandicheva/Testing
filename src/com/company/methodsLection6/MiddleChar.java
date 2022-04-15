package com.company.methodsLection6;

public class MiddleChar {
    public static void main(String[] args) {


        System.out.println( "The middle char is: " + findMiddle("Nikolina123"));

    }

    static String  findMiddle(String myString){
        int n=myString.length();
        String evenLength="";
        String evenLength1= "";
        String oddLength="";

        if (n%2==0){

            evenLength=String.valueOf(myString.charAt((n/2)-1));
            evenLength1=String.valueOf(myString.charAt(n/2));
            evenLength= evenLength+evenLength1;

        }
        else {
                     oddLength=String.valueOf(myString.charAt(n/2));
                     evenLength=oddLength;
        }
     return evenLength;


    }


}
