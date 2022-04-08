package com.company.array;

public class ReverseList {
    public static void main(String[] args) {
        int[] list1={10,20,30,40,50};
        int[] newArray=new int[list1.length];
        int i,j= 0;


        for (i=list1.length-1;i>=0;i--) {
            // for(j= 0;j< newArray.length;j++){
            newArray[j] = list1[i];
            j++;
        }
        System.out.println("Reverted list: ");

                for (j=0;j<= newArray.length-1;j++) {
                    System.out.print(newArray[j]+ "; ");
                }

            }
        }


