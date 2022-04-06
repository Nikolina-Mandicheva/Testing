package com.company.revenue;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner myInput=new Scanner(System.in);
        System.out.println("Enter Product Quantity");

        short quantity= myInput.nextShort();
        double revenue;
        double discount;

        if (quantity<=0){
            System.out.println("Invalid quantity entered");
        }
        else {
            System.out.println("Enter Product Price");
            double productPrice= myInput.nextDouble();
            if (quantity>=100 && quantity<=120){
                discount=(productPrice*quantity)*15/100;
                discount=Math.round(discount*100.0)/100.0;
                System.out.println("Your Received Discount is " +discount +"(15%)");
                revenue=((productPrice*quantity)-discount);
                System.out.println("Your Revenue from Sale is "+ Math.round(revenue*100.0)/100.0 +"$");

            }
            else {
                if (quantity>120){
                    //the top value margin is the data type upper limit of 32 767 or could add a max product quantity
                    discount=(productPrice*quantity)*20/100;
                    discount=Math.round(discount*100.0)/100.0;
                    System.out.println("Your Received Discount is " + discount+"(20%)");
                    revenue=(productPrice*quantity)-discount;
                    System.out.println("Your Revenue from Sale is "+ Math.round(revenue*100.0)/100.0 +"$");
            }
                else {
                    System.out.println("Your Received Discount is 0%");
                    revenue=(productPrice*quantity);
                    System.out.println("Your Revenue from Sale is "+ Math.round(revenue*100.0)/100.0 +"$");
                }

                }
        }


    }
}
