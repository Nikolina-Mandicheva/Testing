package com.company.array;

public class ReverseList {
    public static void main(String[] args) {
        int[] list1={10,20,30,40,50};
        int[] newArray=new int[list1.length+1];
        int i,j=0;

        for (i=list1.length;i>0;i--){
                  // for(j= 0;j< newArray.length;j++){
                newArray[j]=list1[i];
                j++;
               System.out.println(newArray[j]);
            }
        }
    }

